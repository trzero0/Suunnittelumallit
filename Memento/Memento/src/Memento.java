// Memento-luokka, joka sisältää arvotun luvun
public class Memento {
    private final int number;

    public Memento(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

