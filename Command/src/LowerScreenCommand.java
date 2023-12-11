public class LowerScreenCommand implements Command {
    private ProjectionScreen screen;

    public LowerScreenCommand(ProjectionScreen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.lowerScreen();
    }
}

