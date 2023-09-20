public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        // Simuloi kellon tikitystä, jotta näet kellonaikojen päivityksen
        for (int i = 0; i < 24; i++) {
            timer.tick();
            try {
                Thread.sleep(1000); // Pysäytä ohjelma sekunniksi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
