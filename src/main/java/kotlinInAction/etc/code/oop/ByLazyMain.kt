package kotlinInAction.etc.code.oop.lazy

class LazyTest {
    init {
        println("init block")
    }

    private val subject by lazy { // 되도록 private으로!
        println("lazy initialized")
        "Kotlin" // lazy 반환값
    }

    fun flow() {
        println("not initialized")
        println("subject one: $subject") // 최초 초기화 시점
        println("subject two: $subject") // 이미 초기화된 값 사용
    }
}

class Person(val name: String, val age: Int)

fun main() {
    val test = LazyTest()
    test.flow()
    /*
        init block
        not initialized
        lazy initialized
        subject one: Kotlin
        subject two: Kotlin
     */

    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    val person: Person by lazy { // lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person("Moon", 22)
    }

    val personDelegate = lazy { Person("Kim" , 22) }        // 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")                             // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}