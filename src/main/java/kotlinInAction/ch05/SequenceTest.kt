package kotlinInAction.ch05

fun main() {
    println(
        listOf(1, 2, 3, 4).asSequence() // 원본 컬렉션을 시퀀스로 변환한다.
            .map { print("map($it) "); it * it } // 시퀀스도 컬렉션과 똑같은 api를 제공한다.
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList() // 결과 시퀀스를 다시 리스트로 변환한다.
    )
    // map(1) filter(1) map(2) filter(4) map(3) filter(9) map(4) filter(16) [4, 16]

    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
    // 출력 안 됨

    println("다음")
    listOf(1, 2, 3, 4)
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 } // 출력됨
    // map(1) map(2) map(3) map(4) filter(1) filter(4) filter(9) filter(16)

    listOf(1, 2, 3, 4).asSequence()
        .map { print("map1($it) "); it * it }
        .map { print("map2($it) "); it * it }
        .toList()
    // map1(1) map2(1) map1(2) map2(4) map1(3) map2(9) map1(4) map2(16)

    println(
        listOf(1, 2, 3, 4).asSequence()
            .filter { print("filter($it) "); it % 2 == 0 }
            .map { print("map($it) "); it * it }
            .toList()
    )
    // filter(1) filter(2) map(2) filter(3) filter(4) map(4) [4, 16]
}