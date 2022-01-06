package kotlinInAction.ch06

fun main() {
    if (null.isNullOrBlank()) {
        println("null or blank")
    }
    if (!"test".isNullOrBlank()) {
        println("not blank")
    }
}