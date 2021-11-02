package kotlinInAction.ch02

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 프로퍼티 게터 선언
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(40, 44)
    println(rectangle.isSquare)
}