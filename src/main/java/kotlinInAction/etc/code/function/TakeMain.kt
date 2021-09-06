package kotlinInAction.etc.code

fun main() {
    data class Status(val status: Boolean)

    val someObject = Status(true)


    // 기존 코드
    if (someObject != null && someObject.status) {
        doThis()
    }

    // 개선한 코드
    if (someObject?.status == true) {
        doThis()
    }

    // takeIf를 사용해 개선한 코드
    someObject?.takeIf { it.status }?.apply { doThis() }

    /*
        엘비스 연산자(?:)를 함께 사용
     */
    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf 를 사용하여 구현
    input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")

    // takeUnless를 사용하여 구현
    input.indexOf(keyword).takeUnless { it < 0 } ?: error("keyword not found")
}

fun doThis() {
    println("hello world!")
}