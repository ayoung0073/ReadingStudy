package kotlinInAction.etc.code.generic.limit

open class Animal(val size: Int)

class Cat(val jump: Int) : Animal(50) // 하드 코딩

class Spider(val poison: Boolean) : Animal(1)

class Box1<T>
class Box2<out T>
class Box3<in T>

class Box4<out T: Animal>(val element: T) {
    fun getAnimal(): T = element
//    fun setAnimal(new: T) { // out으로 지정되면 메서드 매개변수로 사용 불가하다. out은 반환 형식으로만 사용할 수 있다.
//        element = new
//    }
}

fun main() {
    val c1: Animal = Cat(10)        // 상위 클래스 객체는 하위 클래스로 할당되며, 이 때 캐스팅된다.
    val s1: Animal = Spider(true)

    var a1: Animal = c1 // Animal(20)
    a1 = s1

    println("s1 ${a1.size}") // a1은 Animal 타입이므로 하위 형식인 Spider로 스마트 캐스트되어 값을 사용할 수 있다.
//    println("s1 ${a1.size} ${a1.poison}")

    val b1 = Box1<Animal>()
    val b2 = Box1<Cat>()
//    val b2: Box<Animal> = Box<Cat>() // 에러
    val b3 = Box1<Spider>()

    val ob1: Box2<Animal> = Box2<Cat>()
    val ob2 = Box2<Spider>()

//    val ib1: Box3<Animal> = Box3<Cat>() // 에러
    val ib2: Box3<Cat> = Box3<Animal>()
    val ib3 = Box3<Int>()

//    val oba1 = Box4<Int>() // 에러
    val oba1 = Box4<Cat>(Cat(3))
}
