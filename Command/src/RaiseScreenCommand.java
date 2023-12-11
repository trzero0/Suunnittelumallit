public class RaiseScreenCommand implements Command {
    private ProjectionScreen screen;

    public RaiseScreenCommand(ProjectionScreen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.raiseScreen();
    }
}