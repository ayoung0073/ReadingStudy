package kotlinInAction.etc.code.oop

// var name: String -> 프로퍼티 병합
class Cat { // (var name: String, var age: Int, var tmi: String) { // 주 생성자 (constructor 키워드 생략 가능)
    // 프로퍼티

    var name: String // = name
    var age: Int // = wing
    var tmi: String // = beak


    constructor(name: String, tmi: String, age: Int) {
        this.name = name
        this.age = age
        this.tmi = tmi
    }

    constructor(name: String, tmi: String) {
        this.name = name
        this.tmi = tmi
        this.age = 1
    }

    // 초기화 블록을 사용해서 간단한 코드 넣어보기
//    init {
//        println("======== init start ========")
//        name = name.uppercase() // 초기화 작업: 대문자화
//        println("name: $name, wing: $wing, beak: $beak")
//        println("======== init end ========")
//    }

    /*
    constructor(name: String, wing: Int, beak: String) { // 부 생성자
        this.name = name
        this.wing = wing
        this.beak = beak
    }
    */

    // 메서드
    fun walk() {
        println("$name($age, $tmi): walk")
    }
}

fun main() {
    val nana = Cat("nana",  "pretty", 2)
    val coco = Cat("coco",  "cute")
    nana.walk()
    coco.walk()
}