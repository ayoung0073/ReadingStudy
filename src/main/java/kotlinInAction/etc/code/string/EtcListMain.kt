package kotlinInAction.etc.code.string

fun main() {
    val emptyList: List<String> = emptyList<String>()
    println(emptyList)
    // null이 아닌 요소만 골라 컬렉션을 초기화한다.
    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullsList) // [2, 45, 2, 5]
}