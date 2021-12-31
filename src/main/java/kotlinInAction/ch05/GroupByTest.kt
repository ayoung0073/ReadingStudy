package kotlinInAction.ch05

fun main() {
    val people = listOf(
        Person("ayoung", 23),
        Person("dayoung", 25),
        Person("heeje", 23),
        Person("yuri", 23),
        Person("sohyun", 24)
    )
    println(people.groupBy { it.age })
    // {23=[Person(name=ayoung, age=23), Person(name=heeje, age=23), Person(name=yuri, age=23)], 25=[Person(name=dayoung, age=25)], 24=[Person(name=sohyun, age=24)]}
}