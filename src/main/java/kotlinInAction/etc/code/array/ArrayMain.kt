package kotlinInAction.etc.code.array

import java.util.*

fun main() {
//    val arr = arrayOf(1, 2, 3, "hi")
    val arr = arrayOf(1, 2, 3)

    println("arr: ${Arrays.toString(arr)}") // Arrays.toString()은 배열의 내용을 문자열로 변환한다. 다차원 배열에서는 deepToString() 사용
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}") // 숫자가 아닌 요소가 포함되어 있으면, 에러

    // 게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])
    
    for (i in 0..arr.size - 1) { // 0..~ 대신 arr.indices
        println("arr[$i] = ${arr[i]}")
    }

    val arr1 = intArrayOf(1, 2, 3, 4, 5) // 다섯 개로 고정된 배열
    println("arr1: ${Arrays.toString(arr1)}")

    val arr2 = arr.plus(6)
    println("arr2: ${Arrays.toString(arr2)}")

    // 필요한 범위를 잘라내 새 배열을 생성한다.
    val arr3 = arr1.sliceArray(0..2)
    println("arr3: ${Arrays.toString(arr3)}")

}