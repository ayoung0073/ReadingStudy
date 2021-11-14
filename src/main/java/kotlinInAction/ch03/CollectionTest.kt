package kotlinInAction.ch03

fun main() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 44, 2)
    print(numbers.maxOrNull())
}