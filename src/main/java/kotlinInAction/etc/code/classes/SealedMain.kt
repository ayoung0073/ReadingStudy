package kotlinInAction.etc.code.classes

// 실드 클래스 선언 방법 첫 번째 스타일
sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result() // 실드 클래스 상속은 같은 파일에서만 가능하다.
class Inside: Result.Success("Status") // 내부 클래스 상속

// 실드 클래스 선언 방법 두 번째 스타일
sealed class Result2

open class Success(val message: String): Result2()
class Error(val code: Int, val message: String): Result2()

class Status2: Result2()
class Inside2: Result2()

fun main() {
    // Success에 대한 객체 생성
    val result1 = Result.Success("OK")
    val result2 = Result.Error(404, "No Page")
    val msg1 = eval(result1)
    val msg2 = eval(result2)

    println(msg1)
    println(msg2)
}

// 상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    // 모든 조건을 가지므로 else가 필요 없다.
}