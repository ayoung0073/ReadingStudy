package designPattern.command

class Button {
    private lateinit var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    /*
        Command 패턴을 이용하면 Button 클래스의 코드를 변경하지 않으면서 다양한 동작을 구현할 수 있다
        -> OCP를 따른다
     */

    fun pressed() {
        command.run()
    }
}