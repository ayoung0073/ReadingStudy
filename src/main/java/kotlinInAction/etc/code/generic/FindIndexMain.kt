package kotlinInAction.etc.code.generic

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) { // indices는 배열의 범위를 나타낸다.
        if (a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Mango", "Banana", "Cherry")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find<Int>(arr2, 2))
}
/*
    arr.indices 0..3
    3
    1
 */