public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        // Toteuta kellonajan näyttäminen digitaalisesti
        // Tässä vain tulostetaan se konsoliin.
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
}
