package kotlinInAction.etc.code.collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "Python")

    // forEach: 각 요소를 람다식으로 처리한다.
    list.forEach { print("$it ") }
    println()
    // 인덱스를 포함한다.
    list.forEachIndexed { index, value ->  println("index[$index]: $value") }
}