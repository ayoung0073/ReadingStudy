package kotlinInAction.etc.code

fun main() {
    var m = 1
    m = m.also { it + 3 }
    println(m) // 원본 값 1

    /*
        let과 also 비교
     */
    data class Person(var name: String, var skills: String)
    var person = Person("Ayoung", "Kotlin")

    val a = person.let {
        it.skills = "Springboot"
        "success"
    }

    println(person)
    println("a: $a") // String

    val b = person.also {
        it.skills = "Java"
        "success" // 마지막 문장 사용되지 않는다.
    }
    println(person)
    println("b: $b") // Person의 객체 b
    /*
        Person(name=Ayoung, skills=Springboot)
        a: success
        Person(name=Ayoung, skills=Java)
        b: Person(name=Ayoung, skills=Java)
     */
}
