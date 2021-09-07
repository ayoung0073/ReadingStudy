package kotlinInAction.etc.code.oop

// 여러 마리의 오리를 위한 List 매개변수
class Pond(val name: String, val members: MutableList<Duck>) {
    constructor(name: String): this(name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {
    // 두 개체는 서로 생명주기에 영향을 주지 않는다.
    val pond = Pond("myFavorite")
    val duck1 = Duck("duck1")
    val duck2 = Duck("duck2")

    // 연못에 오리를 추가: 연못에 오리가 집합한다.
    pond.members.add(duck1)
    pond.members.add(duck2)

    // 연못에 있는 오리들
    for (duck in pond.members) {
        println(duck.name)
    }
}