package designPattern.command

class HeaterOnCommand(
    private val heater: Heater
): Command {
    override fun run() {
        heater.powerOn()
    }
}