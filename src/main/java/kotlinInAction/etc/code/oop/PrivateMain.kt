package kotlinInAction.etc.code.oop

private class PrivateTest {
    private var i = 1
    private fun privateFunc() { // private
        i += 1 // 접근 허용
        println(i)
    }

    fun access() {              // public
        privateFunc()           // 내부에서 private 메서드 호출(접근 허용
    }
}

class OtherClass {
    // val pc = PrivateTest()      // 공개 생성 불가, 프로퍼티 opc는 private이 되어야 한다. private을 붙이면 가능하다.
    private val pc = PrivateTest() // private을 붙이면 가능하다.
    fun test() {
        val pc = PrivateTest()    // 가능
        pc.access()
    }
}

fun main() { // 탑레벨 함수
    val pc = PrivateTest()
    // pc.i = 3         // 접근 불가
    // pc.privateFunc() // 접근 불가
    pc.access()
}

fun topFunction() { // 탑 레벨에서는 생성 가능
    val pc = PrivateTest()
}