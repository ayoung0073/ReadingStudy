package designPattern.command.etc

import designPattern.command.Heater
import designPattern.command.Lamp


fun main() {
    val heater = Heater()
    val lamp = Lamp()

    val button = Button(
        heater = heater,
        lamp = lamp
    )

    // 히터를 킨다
    button.setMode(0)
    button.pressed()

    // 램프를 킨다
    button.setMode(1)
    button.pressed()
}