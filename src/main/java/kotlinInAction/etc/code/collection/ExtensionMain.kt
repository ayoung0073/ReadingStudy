package kotlinInAction.etc.code.collection

fun main() {
    // listOf는 불변 리스트 컬렉션을 초기화할 때 사용하는 함수이다. -> 원본 컬렉션에 요소를 추가하거나 삭제할 수 없다.
    val list1 = listOf("one", "two", "three")
    val list2 = listOf(1, 2, 3)

    println(list1 + "four") // [one, two, three, four]
    println(list2 + "hello") // [1, 2, 3, hello]
    println(list2 + 4) // [1, 2, 3, 4]

    println(list1 - "one" + "four") // [two, three, four]
    println(list2 - 8) // [1, 2, 3]
    println(list2 - 2) // [1, 3]

    println(list1 + listOf("abc", "def")) // [one, two, three, abc, def]


    val map = mapOf("hi" to 1, "hello" to 2, "bye" to 3)
    println(map + Pair("goodbye", 4)) // {hi=1, hello=2, bye=3, goodbye=4}
    println(map - "hello") // hello 키 제거
    println(map + mapOf("Apple" to 4, "Orange" to 5))
    println(map - listOf("hi", "hello")) // {bye=3} // 키에 해당하는 내용 삭제
}