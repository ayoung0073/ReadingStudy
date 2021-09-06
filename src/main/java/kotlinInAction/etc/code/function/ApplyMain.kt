package kotlinInAction.etc.code

fun main() {
    data class Person(var name: String, var skills : String)
    var person = Person("Ayoung", "Kotlin")

    // 여기서 this는 person 객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Maong"  // this는 생략 가능
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
    }

    println(person)
    println(returnObj)
    /*
        Person(name=Ayoung, skills=Swift)
        Person(name=Maong, skills=Java)
        Person(name=Maong, skills=Java)
     */
}