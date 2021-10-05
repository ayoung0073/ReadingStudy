package kotlinInAction.ch01

// 데이터 클래스
data class Person(val name: String, val age: Int? = null) // 널이 될 수 있는 타입(Int?)과 파라미터 티폴트 값이다.

fun main() { // 최상위 함수
    val persons = listOf(Person("아용"), Person("애용", age = 20)) // 이름 붙인 파라미터

    val oldest = persons.maxByOrNull { it.age ?: 0 } // 람다식과 엘비스 연산자

    println("나이가 가장 많은 사람: $oldest") // 문자열 템플릿
}
// 나이가 가장 많은 사람: Person(name=애용, age=20)