package kotlinInAction.ch03.strings

val UNIX_LINE_SEPARATOR1 = "\n"
const val UNIX_LINE_SEPARATOR2 = "\n"

fun String.lastChar(): Char = get(length - 1)
//fun String.lastChar(): Char = this[length - 1]

fun <T> joinToString(
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