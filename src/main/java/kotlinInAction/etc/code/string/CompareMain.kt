package kotlinInAction.etc.code.string

fun main() {
    val s1 = "Hello Kotlin"
    val s2 = "Hello KOTLIN"
    // 같으면 0, s1 < s2 이면 양수, 반대면 음수를 반환한다.
    println(s1.compareTo(s2)) // 32
    println(s1.compareTo(s2, true)) // 0 //  대소문자를 무시한다.
}