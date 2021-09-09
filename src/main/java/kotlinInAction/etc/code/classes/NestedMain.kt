package kotlinInAction.etc.code.classes

class Outer {
    val ov = 5

    companion object {  // 컴패니언 객체는 static처럼 접근 가능하다.
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }

    class Nested { // 중첩 클래스
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" // 외부의 ov에는 접근이 불가하다.
        fun companionTest() = "[Nested] Outer country: $country"
        fun accessOuter() { // 컴패니언 객체는 접근할 수 있다.
            println(country)
            getSomething()
        }
    }

    inner class Inner { // 이너 클래스
        val iv = 100
        fun greeting() = "[Inner] Hello! $ov, $iv"
    }

    fun outside() {
        val msg1 = Nested().greeting()          // Outer 객체 생성 없이 중첩 클래스의 메서드에 접근한다.
        val msg2 = Inner().greeting()
        println("[ALL]: $ov")
        println("[Outer]: $msg1, ${Nested().nv}")
        println("[Inner]: $msg2, ${Inner().iv}")
    }
}

fun main() {
    // static 처럼 Outer의 객체 생성 없이 Nested 객체를 생성 사용할 수 있다.
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside()          // 에러, Outer 객체 생성이 필요하다.
    Outer().outside()
    Outer.Nested().greeting()   // Outer 객체 생성 없이 가능
    // Outer.Inner().greeting() // 에러
    Outer().Inner().greeting()
    Outer.Nested().accessOuter()
    println(Outer.Nested().companionTest())
    val outer = Outer()
    outer.outside()
}