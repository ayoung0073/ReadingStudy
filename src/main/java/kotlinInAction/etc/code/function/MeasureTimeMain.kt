package kotlinInAction.etc.code

fun main() {
    val executionTime = measureNanoTime {
        var name = "Ayoung"
        println("Name: $name")
        name = "Maong"
        println("Name: $name")
    }
    println(executionTime)
}

// 코틀린 system 패키지의 Timing.kt 파일
public inline fun measureTimeMillis(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

public inline fun measureNanoTime(block: () -> Unit): Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}