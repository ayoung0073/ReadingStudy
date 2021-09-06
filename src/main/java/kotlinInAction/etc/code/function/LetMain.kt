package kotlinInAction.etc.code.let

fun main() {
//    val score: Int? = 32
    var score = null

    //  일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let을 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") } // if 문 대신 세이프콜로 검사한다. score이 null인 경우는 패스. (세이프콜)
        val str = score.let { it.toString() } // 선언과 동시에 사용. it은 score 자체를 복사한다. score이 null 인 경우 null 저장된다.
        println(str)
    }

    checkScore()
    checkScoreLet()

    /*
        let 함수의 체이닝
     */
    var a = 1
    val b = 2
    a = a.let { it + 2 }.let {
        println("a = $a") // 복사돼서 들어왔기 때문에 변경된 값이 아니다. 1
        val i = it + b // 3 + 2
        i // 마지막 식 반환
    }
    println(a) // 5

    /*
        let의 중첩 사용
     */

    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer") // 이떄는 it을 사용하지 않고 명시적 이름을 사용한다.
        }
    }
    println(x)

    /*
        반환값은 바깥쪽의 람다식에만 적용
     */
    x = x.let { outer ->
        outer.let { inner ->
            println("Inner is $inner and outer is $outer")
            "Inner String" // 반환되지 않는다.
        }
        "Outer String"
    }
    println(x)

    /*
        null 가능성 있는 객체에서 let() 활용하기
     */
    val firstName: String? = null
    val lastName: String = "test"

    // if 문을 사용할 경우
    if (null != firstName) {
        println("$firstName $lastName")
    } else {
        println(lastName)
    }

    // let 을 사용한 경우
    firstName?.let { println("$it $lastName") } ?: println(lastName)
}