package kotlinInAction.ch05

data class Person(val name: String, val age: Int)

fun main() {
    val canBeInClub23 = { p: Person -> p.age <= 23 }

    val people = listOf(Person("ayoung", 23), Person("dayoung", 25), Person("sohyun", 24))
    println(people.all(canBeInClub23)) // false
    println(people.any(canBeInClub23)) // true
    println(people.count(canBeInClub23)) // 1
    println(people.find(canBeInClub23)) // Person(name=ayoung, age=23)
    println(people.firstOrNull(canBeInClub23)) // find는 firstOfNull과 같다
}
