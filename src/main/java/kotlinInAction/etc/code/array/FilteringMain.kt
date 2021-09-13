package kotlinInAction.etc.code.array

fun main() {
    // 0보다 큰 수 골라내기
    val arr = arrayOf(1, -2, 3, 4, -5, 0)
    arr.filter { e -> e > 0 }.forEach { e -> print("$e ") }

    println()

    val fruits = arrayOf("banana", "avocado", "apple", "kiwi", "mango")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}