package kotlinInAction.etc.code

fun main() {
    val calc = Calc()
    var result = 0 // 외부 변수
    calc.addNum(2, 3) { x, y -> result = x + y } // 클로저
    println(result) // 값을 유지하여 5가 출력

    val length = 4
    filteredNames(length) // [Moon, Hong]
}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) { // 람다식 add에는 반환값이 없음
        add(a, b)
    }
}

// 함수의 매개변수에 접근
fun filteredNames(length: Int) {
    val names = arrayListOf("Moon", "Ayoung", "Hong", "Kim")
    val filterResult = names.filter {
        it.length == length // 바깥의 length 에 접근
    }
    println(filterResult)
}