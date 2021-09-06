package kotlinInAction.etc.code.oop

open class Bird(var name: String, var wing: Int, var beak: String) {

    open fun fly() { // 오버라이딩을 위해 open 키워드
        println("Fly")
    }

}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak) {

    fun singHitone() {
        println("sing Hitone")
    }

    override fun fly() {
        println("Quick Fly")
    }

}

class Parrot : Bird { // 반드시 부모 클래스가 가지는 생성자의 내용이 주 혹은 부 생성자에 정의되어 있어야 한다.
    var language: String

    // 부 생성자
    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) { // super 중요
        this.language = language
    }

    fun speak() {
        println("Speak: $language")
    }

    override fun fly() {
        println("Slow Fly")
        super.fly()
    }

}

open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }
    constructor(firstName: String, age: Int) { // 3
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer: Person {
    constructor(firstName: String): this(firstName, 10) { // 1
        println("[Developer] $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age) { // 2
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val lark: Bird = Lark("mylark", 2, "short")
    val parrot: Bird = Parrot("myparrot", 2, "long", "English")

    println("lark - name: ${lark.name}")
    // println("parrot - name: ${parrot.name}, lang: ${parrot.language}")

    // lark.singHitone() // Bird를 상속하면 불가
    lark.fly() // 하위 타입에 맞춰진 메서드 동작

    // parrot.speak()
    parrot.fly()

    val developer = Developer("Ayoung")
}

