package kotlinInAction.etc.code.oop

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f() // 현재 이너 클래스의 f() 접근
            Child().f() // 바로 바깥 클래스 f()의 접근
            super@Child.f() // Child의 상위 클래스인 Base 클래스의 f() 접근
            println("[Inside] super@Child.x: ${super@Child.x}") // Base의 x 접근
        }
    }
}

fun main() {
    val c = Child()
    c.Inside().test() // 이너 클래스의 Inside의 메서드 test() 실행
}
/*
    Inside Class f()
    Child Class f()
    Base Class f()
    [Inside] super@Child.x: 1
 */