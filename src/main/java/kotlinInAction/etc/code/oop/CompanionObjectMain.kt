package kotlinInAction.etc.code.oop.companion

class Person {
    var id: Int = 0
    var name: String = "Ayoung"
    /*
        고정된 static 내부 클래스처럼 정의되어 language와 work() 메서드는 단일(싱글톤) 접근 요소가 된다. 따라서 객체 생성이 필요 없다.
        컴패니언 객체는 실제 객체의 싱글톤(singleton)으로 정의된다.
     */
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working,,,")
        }
    }
}

fun main() {
    println(Person.language)    // 인스턴스를 생성하지 않고 기본값을 사용한다.
    Person.language = "English" // 기본값 변경 가능하다.
    println(Person.language)    // 변경된 내용 출력한다.
    Person.work()               // 메서드 실행
    // println(Person.name)     // name은 companion object가 아니므로 에러
}