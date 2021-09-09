package kotlinInAction.etc.code.oop

class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field // age하면 무한 참조됨. 스택오버플로우
        set(value) { // 중복이라 경고 표시
            field = value
        }
}

fun main() {
    val user1 = User(1, "Ayoung", 22)
    user1.age = 20
    println("user1.age = ${user1.age}")
}