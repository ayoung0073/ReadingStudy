package kotlinInAction.ch04

data class Client(val name: String, val postalCode: Int)

fun main() {
    val moon = Client("문아영", 4022)
    println(moon)
    println(moon.copy())
    println(moon.copy(name = "문마음"))
}