package kotlinInAction.ch05

class Book(val title: String, val authors: List<String>)

fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Ayoung")),
        Book("Friday Next", listOf("Jenny", "Neil")),
        Book("Saturday Next", listOf("Jenny"))
    )
    println(books.flatMap { it.authors }) // [Ayoung, Jenny, Neil, Jenny]
    println(books.flatMap { it.authors }.toSet()) // [Ayoung, Jenny, Neil]

    println(arrayOf(arrayOf("a"), arrayOf("b", "c"), arrayOf("abc", "def")).flatten()) // [a, b, c, abc, def]
}
