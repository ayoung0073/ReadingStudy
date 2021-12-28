package kotlinInAction.ch04

// 비즈니스 로직 모듈
class Person(val name: String) {
    // 확장 함수를 사용하기 위해서 빈 동반 객체 정의가 필요하다.
    companion object
}

// 클라이언트/서버 통신 모듈
// 외부에서 동반 객체의 확장 함수를 구현해 관심사를 분리할 수 있다.
fun Person.Companion.fromJSON(json: String): Person {
    TODO()
}

// val p = Person.fromJSON(json)