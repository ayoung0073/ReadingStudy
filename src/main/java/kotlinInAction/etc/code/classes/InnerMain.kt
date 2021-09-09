package kotlinInAction.etc.code.classes


interface Switcher { // 인터페이스의 선언
    fun on(): String
}


class Smartphone(val model: String) {

    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = println("$model : Installed on $cpu with $size GB")
    }

    fun powerOn(): String {
        class Led(val color: String) {  // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model"  // 외부의 프로퍼티는 접근 가능
        }

        val powerStatus = Led("Red") // 여기에서 지역 클래스가 사용된다.

        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    } // powerOn() 블록 끝
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(128)
    mySdcard.getInfo()
    val myPhone = Smartphone("Note9")
    println(myPhone.powerOn())
}