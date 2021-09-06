package kotlinInAction.etc.code

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Ayoung", "Java")

    val result = with(user) {
        skills = "Kotlin"
        email = "ayong0310@naver.com"
//        "success" // 기본적으로 Unit을 반환하지만, 필요하면 다음과 같이 마지막 표현식을 반환할 수 있다.
    }

    println(user)
    println("result: $result")
}