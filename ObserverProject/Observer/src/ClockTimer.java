import java.util.HashSet;
import java.util.Set;

public class ClockTimer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        // Simuloi kellon tikitys ja päivitys
        // Voit toteuttaa tämän haluamallasi tavalla.
        // Esimerkiksi päivittää kellonaika ja kutsua notifyObservers().
        // Tässä vain simuloidaan päivitys jollakin tavalla.
        hour++;
        if (hour == 24) {
            hour = 0;
        }
        notifyObservers();
    }
}
