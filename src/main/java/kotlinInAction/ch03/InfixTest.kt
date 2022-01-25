package kotlinInAction.ch03

infix fun Int.plus(other: Int) = this + other // this.plus(other)과 같다.
infix fun Int.minus(other: Int) = this.minus(other)

fun main() {
    println(4 plus 5) // 9
    println(4 minus 5) // -1
}