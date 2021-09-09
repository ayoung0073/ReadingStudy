package kotlinInAction.etc.code.classes

// 추상 클래스의 선언
abstract class Printer {
    abstract fun print() // 추상 메서드
}

// 추상 클래스로부터 하위 클래스를 생성하지 않고도 단일 인스턴스로 객체 생성 가능하다.
val myPrinter = object: Printer() { // 객체 인스턴스
    override fun print() { // 추상 메서드 구현
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}