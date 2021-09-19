package kotlinInAction.etc.code.string

fun main() {
    // 불변형 list의 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "two", "three")

    for (name in names) {
        println(name)
    }

    for (num in numbers) println(num) // 한 줄에서 처리하기
    // names[2] = "four" // 불가
    println()
}