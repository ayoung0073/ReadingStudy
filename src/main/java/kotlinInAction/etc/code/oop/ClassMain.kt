package kotlinInAction.etc.code.oop

class Car {
    val wheel: Int = 4

    fun start() {
        println("Engine Start!")
    }
}

fun main() {
    val sonata = Car()

    println(sonata.wheel)
    sonata.start()
}