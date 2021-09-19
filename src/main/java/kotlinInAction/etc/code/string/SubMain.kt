package kotlinInAction.etc.code.string

fun main() {
    var s = "abcdef"
    println(s.substring(0..2))
    // abc
    s = s.substring(0..1) + "x" + s.substring(3 until s.length)
    // abxdef
    // s = s.substring(0..1) + "x" + s.substring(3..s.length - 1) // 같은 코드
    // ab를 추출하고 x를 덧붙이고 다시 def 를 추출한다.
    // 메모리 새로 할당

    println(s)
}