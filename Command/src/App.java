public class App {
    public static void main(String[] args) {
        ProjectionScreen screen = new ProjectionScreen();
        Command raiseCommand = new RaiseScreenCommand(screen);
        Command lowerCommand = new LowerScreenCommand(screen);

        ScreenControlButton upButton = new ScreenControlButton(raiseCommand);
        ScreenControlButton downButton = new ScreenControlButton(lowerCommand);

        upButton.press();   // Tulostaa: "Valkokangas on ylhäällä"
        downButton.press(); // Tulostaa: "Valkokangas on alhaalla"
    }
}
