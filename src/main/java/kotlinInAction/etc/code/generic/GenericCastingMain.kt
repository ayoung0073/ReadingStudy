package kotlinInAction.etc.code.generic

open class Parent

class Child: Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child()
    // val obj2: Child = Parent() // 애러, 하위 형식인 Child의 객체 obj2는 Parent로 변환되지 않는다.
    // val obj3: Cup<Parent> = Cup<Child> // 에러, 자료형 형식이 일치하지 않는다.
    // val obj3: Cup<Child> = Cup<Parent> // 에러, 자료형 형식이 일치하지 않는다.

    val obj5 = Cup<Child>() // obj5는 Cup<Child> 형식이 된다.
    val obj6: Cup<Child> = obj5 // 형식이 일치하므로 ok

    // 가변성을 주기 위해 in, out 등을 설정해야 한다.!!!
}