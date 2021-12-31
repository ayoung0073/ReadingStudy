package kotlinInAction.ch05

fun main() {
    val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two")
    println(numbers.filterKeys { it >= 1 })
    println(numbers.mapKeys { it.key.times(it.key) })
    println(numbers.filterValues { it.length == 3 })
    println(numbers.mapValues { it.value.uppercase() })
    /*
        {1=one, 2=two}
        {0=zero, 1=one, 4=two}
        {1=one, 2=two}
        {0=ZERO, 1=ONE, 2=TWO}
     */
}

