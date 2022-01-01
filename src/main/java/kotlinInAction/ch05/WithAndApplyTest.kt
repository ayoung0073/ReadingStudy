package kotlinInAction.ch05

// buildString으로 알파벳 만들기
fun alphabetByWith() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun alphabetByApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main() {
    println(alphabetByWith())
    println(alphabetByApply())
}