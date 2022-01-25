package kotlinInAction.ch03

/* 자바
class Playground {
    public static void main(String[ ] args) {
        String[] stringList = "12.3*45-6.A".split("\\.");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
*/

// 코틀린
fun main() {
    val stringList = "12.3*45-6.A".split(".")
    for (str in stringList) {
        println(str)
    }
}
/*
    12
    3*45-6
    A
 */