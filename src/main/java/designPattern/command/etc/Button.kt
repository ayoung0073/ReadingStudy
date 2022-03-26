package designPattern.command.etc

import designPattern.command.Lamp
import designPattern.command.Heater

class Button(
    private val heater: Heater,
    private val lamp: Lamp,
) {
    private lateinit var mode: String

    fun setMode(index: Int) {
        mode = modes[index]
    }

    /*
        Button의 기능이 많아질수록 객체 프로퍼티는 더욱 늘어날 것이다.
        기존의 pressed() 메서드에서 분기가 늘어날 것이다.
        -> OCP 위배
     */

    fun pressed() {
        when (mode) {
            "heater" -> heater.powerOn()
            "lamp" -> lamp.turnOn()
        }
    }

    companion object {
        private val modes = listOf("heater", "lamp")
    }
}