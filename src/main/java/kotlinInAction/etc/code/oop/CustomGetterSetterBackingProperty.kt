package kotlinInAction.etc.code.oop.back

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String ? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "Ayoung", 22)
    user1.name = ""
    println("user1.name = ${user1.name}")
}