package kotlinInAction.etc.code.generic

class Box<T>(a: T) {
    var name = a
}

fun main() {
    val box1 = Box(1) // 추론 가능 val box1: Box<Int> = Box(1)
    val box2 = Box("Ayoung")

    println(box1.name)
    println(box2.name)
}