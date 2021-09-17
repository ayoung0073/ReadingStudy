package kotlinInAction.etc.code.generic

class GenericNull<T> { // 기본적으로 null이 허용되는 형식 매개변수?
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null
    obj.equalityFunc("Hello", "World") // null 허용 x

    val obj2 = GenericNull<Int?>()  // null 가능한 형식으로 사용됨
    obj2.equalityFunc(null, 10) // null 사용
}