package kotlinInAction.etc.code.collection

fun main() {
    // 가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    /*
    val 변수는 stringList 변수에 다른 형식의 재할당을 금지할 뿐,
    이미 할당된 리스트의 추가 삭제와는 무관하다.
     */
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}