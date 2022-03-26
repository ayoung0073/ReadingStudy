package designPattern.command

fun main() {
    val heater = Heater()
    val lamp = Lamp()

    val heaterOnCommand = HeaterOnCommand(heater)
    val lampOnCommand = LampOnCommand(lamp)

    val button = Button()

    // 히터를 킨다
    button.setCommand(heaterOnCommand)
    button.pressed()

    // 램프를 킨다
    button.setCommand(lampOnCommand)
    button.pressed()
}