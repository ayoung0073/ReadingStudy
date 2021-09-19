package kotlinInAction.etc.code.collection

fun main() {
    val mixedTypeSet = setOf("hello", 5, "world", 3.14, 'c')
    val intSet = setOf<Int>(1, 4, 4)

    println(mixedTypeSet)
    println(intSet)

    val mutableList = intSet.toMutableSet()
    // mutableList.add("hi") // 타입 에러

    println(intSet)
}