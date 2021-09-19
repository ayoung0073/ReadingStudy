package kotlinInAction.etc.code.collection

fun main() {
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to " Python")
    // set 할 수 없다.
    for ((key, value) in langMap) {
        println("key=$key, value=$value")
    }
    println("langMap[22] = ${langMap[22]}") // 키 22에 대한 요소 출력
    println("langMap.get(33) = ${langMap.get(33)}") // 위와 같은 표현
    println("langMap.keys = ${langMap.keys}") // 맵의 모든 키 출력
    println(langMap[3122]) // null

    val capitalCityMap: MutableMap<String, String> = mutableMapOf("Korea" to "Seoul", "China" to "Beijing")
    capitalCityMap["UK"] = "London"  // capitalCityMap.put("UK", "London") 같은 표현
    capitalCityMap.remove("China")
    println(capitalCityMap)
}