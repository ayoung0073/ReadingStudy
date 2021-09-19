package kotlinInAction.etc.code.collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    // map: 컬렉션에 주어진 식을 적용해 새로운 컬렉션을 반환한다.
    println(list.map { it * 2 }) //

    // mapIndexed: 컬렉션에 인덱스를 포함해 주어진 식을 적용해 새로운 컬렉션을 반환한다.
    val mapIndexed = list.mapIndexed { index, it -> index * it }
    println(mapIndexed)

    // mapNotNull: null을 제외하고 식을 적용해 새로운 컬렉션을 반환한다.
    println(listWithNull.mapNotNull { it?.times(2) }) // 2를 곱한다.

    println(list)
    // [1, 2, 3, 4, 5, 6]
    println(list.flatMap { listOf(it, 'A') })
    // [1, A, 2, A, 3, A, 4, A, 5, A, 6, A]
    val result = listOf("abc", "12").flatMap { it.toList() }
    // 요소에 toList()를 사용하면 "abc"는 a, b, c 처럼 분해되어 리스트 컬렉션으로 만들어진다.
    println(result)
    // [a, b, c, 1, 2]

    // groupBy: 주어진 식에 따라 요소를 그룹화하고 이것을 다시 Map으로 반환한다.
    val grpMap = list.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(grpMap)
    // {odd=[1, 3, 5], even=[2, 4, 6]}
}