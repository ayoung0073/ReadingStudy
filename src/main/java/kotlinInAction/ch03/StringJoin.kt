package kotlinInAction.ch03

fun main() {
    val list = listOf(1, 2, 3)
    // println(list) // [1, 2, 3]

    println(joinToString1(list, "; ", "(", ")")) // (1; 2; 3)

    println(joinToString2(list, "; ", "(", ")"))
    println(joinToString2(list))
    println(joinToString2(list, prefix = "#", postfix = ";"))

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.joinToString(" "))
}

fun <T> joinToString1(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun <T> Collection<T>.joinToString( // Collection<T>에 대한 확장 함수 선언
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) { // this: 수신 객체를 가리킨다. 여기서는 T 타입의 원소로 이뤄진 컬렉션이다.
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}