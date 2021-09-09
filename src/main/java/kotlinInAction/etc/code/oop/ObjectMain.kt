package kotlinInAction.etc.code.oop

object OCustomer { // object 선언에는 생성 호출을 하지 않는다.
    var name = "Ayoung"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Coding")
    init {
        println("Init!")
    }
}

class Hobby(val name: String)

open class Superman() {
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air")
}

fun main() {
    OCustomer.greeting() // 객체의 접근 시점
    OCustomer.name = "Maong"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    objectTest()
}

fun objectTest() {
    val pretendedMan = object: Superman() { // object 표현식으로 fly() 구현의 재정의
        override fun fly() = println("I'm not a real superman, I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}