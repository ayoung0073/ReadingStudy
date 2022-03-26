package designPattern.command

class LampOnCommand(
    private val lamp: Lamp
): Command{
    override fun run() {
        lamp.turnOn()
    }
}