package kotlinInAction.etc.code.collection

fun main() {
    // 시드값 1을 시작으로 1씩 증가하는 시퀀스를 정의한다.
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    // take()을 사용해 원하는 요소 개수만큼 획득하고
    // toList()를 사용해 List 컬렉션으로 반환한다.
    println(nums.take(10).toList())
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    // map이나 fold 같은 연산 같이 사용해보기
    val squares = generateSequence(1) { it + 1 }.map { it * it }
    println(squares.take(10).toList())
    // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(10).toList())
    // [1, 9, 25, 49, 81, 121, 169, 225, 289, 361]

    // 단순 메서드 체이닝 사용하는 경우
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1
        .map { print("map($it) "); it * it }
        .filter { println("filter($it) "); it % 2 == 0 }

    println(listDefault)
    /*
        map(1) map(2) map(3) map(4) map(5) filter(1)
        filter(4)
        filter(9)
        filter(16)
        filter(25)
        [4, 16]
     */

    // asSequence() 사용해보기
    val listSequence = list1.asSequence()
        .map { print("map($it) "); it * it }
        .filter { println("filter($it) "); it % 2 == 0}
        .toList()

    println(listSequence)
    /*
        map(1) filter(1)
        map(2) filter(4)
        map(3) filter(9)
        map(4) filter(16)
        map(5) filter(25)
        [4, 16]
     */
}