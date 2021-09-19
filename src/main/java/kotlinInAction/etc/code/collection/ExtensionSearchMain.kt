package kotlinInAction.etc.code.collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // elementAt: 인덱스에 해당하는 요소 반환
    println("list.elementAt(1): " + list.elementAt(1))
    println("list[1]: " + list[1])

    /*
        list.elementAt(1): 2
        list[1]: 2
     */

    // elementAtOrElse: 인덱스를 벗어나는 경우 식에 따라 결과 반환 아니면 요소 반환
    println("elementAtOrElse: " + list.elementAtOrElse(2) { 2 * it })
    println("elementAtOrElse: " + list.elementAtOrElse(10) { 2 * it })
    println("elementAtOrElse: " + list.elementAtOrElse(15) { 2 * it })
    // println("list[15]: " + list[15]) // ArrayIndexOutOfBoundsException
    // println("elementAtOrElse: " + list.elementAtOrElse(10, { 2 * it })) // 같은 표현
    /*
        elementAtOrElse: 3
        elementAtOrElse: 20
        elementAtOrElse: 30
     */

    // elementAtOrNull: 인덱스를 벗어나는 경우 null을 반환
    println("elementAtOrNull: " + list.elementAtOrNull(2))
    println("elementAtOrNull: " + list.elementAtOrNull(10))
    /*
        elementAtOrNull: null
     */
}