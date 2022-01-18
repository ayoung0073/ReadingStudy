package kotlinInAction.ch07

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main() {
    var point = Point(3, 4)
    point += Point(2, 3)
    println(point)
}