public class AnalogClock implements Observer {
    private ClockTimer timer;

    public AnalogClock(ClockTimer ct) {
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s == timer) {
            // Toteuta analogisen kellon päivitys tarvittaessa
        }
    }
}
