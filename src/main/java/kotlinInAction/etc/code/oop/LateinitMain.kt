package kotlinInAction.etc.code.oop.late

class Person {
    lateinit var name: String // 1. 늦은 초기화를 위한 선언

    fun test() {
        if (!::name.isInitialized) {
        println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val ayoung = Person()
    // 초기화 안 된 경우 접근하면 UninitializedPropertyAccessException
    // println(ayoung.name)
    ayoung.test()
    ayoung.name = "Ayoung"
    ayoung.test()
    println("name = ${ayoung.name}")
}