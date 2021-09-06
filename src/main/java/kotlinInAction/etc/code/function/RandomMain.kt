package kotlinInAction.etc.code

import kotlin.random.Random // 자바와 헷갈리지 않도록.

fun main() {
    val number = Random.nextInt(21)
    println(number)
}