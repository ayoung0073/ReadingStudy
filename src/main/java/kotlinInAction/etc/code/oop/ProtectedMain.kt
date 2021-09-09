package kotlinInAction.etc.code.oop.protected

open class Base {       // 최상위 선언 클래스에는 protected를 사용할 수 없다.
    var i = 1
    protected fun protectedFunc() {
        println("protectedFunc 메서드 호출됨")
        i += 1              // 접근 허용
        println(i)
    }

    fun access() {
        protectedFunc()     // 접근 허용
    }

    protected class Nested  // 내부 클래스에는 지시자 허용
}

class Derived : Base() {
    fun test(base: Base): Int {
        println("Derived 에서 Base protectedFunc 메서드 호출 시작")
        protectedFunc()     // Base 클래스 메서드 접근 가능
        println("public access 메서드 호출")
        access()            // 공개 접근
        return i            // Base 클래스의 프로퍼티 접근 가능
    }
}

fun main() {
    val base = Base()
    // base.i               // 접근 불가
    // base.protectedFunc() // 접근 불가
    base.access()

    val derived = Derived()
    derived.test(base)
}
