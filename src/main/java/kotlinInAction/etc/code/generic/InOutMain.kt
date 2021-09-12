package kotlinInAction.etc.code.generic

class InOutTest<in T, out U>(t: T, u: U) {
//    val propT: T = t // 에러, T는 in 위치이기 때문에, out 위치에 사용 불가하다.
    val propU: U = u // U는 out 위치로 가능하다.

//    fun func1(u: U) // 에러, U는 out 위치이기 때문에 in 위치에 사용 불가하다.
    fun func2(t: T) { // T는 in 위치에 사용된다.
        print(t)
    }

    fun starTestFunc(v: InOutTest<*, *>) {
//        v.func2(1) // 에러, Nothing으로 인자를 처리
        print(v.propU)
    }
}