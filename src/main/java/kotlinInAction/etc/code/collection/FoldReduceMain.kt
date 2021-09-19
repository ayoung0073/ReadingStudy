package kotlinInAction.etc.code.collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)

    // fold: 초기값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성한다.
    println(list.fold(4) { total, next -> total + next })
    // 4 + 1 + ... + 6 = 25
    println(list.fold(1) { total, next -> total * next })
    // 1 * 1 * 2 ... * 6 = 720

    // foldRight: fold와 같고 마지막 요소에서 처음 요소로 반대로 적용된다.
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) { total, next -> total * next })

    // reduce: fold와 동일하지만 초기값을 사용하지 않는다.
    println(list.reduce { total, next -> total + next }) // 21
    println(list.reduceRight { total, next -> total + next })
}