package kotlinInAction.etc.code

fun main() {

    val a = 10
//    var skills = "Kotlin"
//    skills = run {
//        "Kotlin Level:" + a // 마지막 표현식이 반환됨
//    }
//    println(skills)

    data class Person(var name: String, var skills : String)
    val person = Person("Ayoung", "Kotlin")

    // 여기서 this는 person 객체를 가리킴
    person.apply { skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Maong"  // this는 생략 가능
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
        "success"       // 적용되지 않는다.
    }

    println(person)
    println(returnObj)

    val returnObj2 = person.run {
        name = "Maum"
        skills = "Python"
        "success"
    }

    println(person)
    println(returnObj2)

}