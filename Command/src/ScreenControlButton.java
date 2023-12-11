public class ScreenControlButton {
    private Command command;

    public ScreenControlButton(Command cmd) {
        this.command = cmd;
    }

    public void press() {
        command.execute();
    }
}