package kotlinInAction.ch06

fun main() {
    val testList = mutableListOf(1, 2, 4)
    testList[1] = 3

    println(testList)
}