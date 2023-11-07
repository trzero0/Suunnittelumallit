import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> valokuvakansio = new ArrayList<>();
        valokuvakansio.add(new ProxyImage("kuva1.jpg"));
        valokuvakansio.add(new ProxyImage("kuva2.jpg"));
        valokuvakansio.add(new ProxyImage("kuva3.jpg"));

        System.out.println("Valokuvakansion sisältö:");

        for (Image kuva : valokuvakansio) {
            kuva.showData();
        }

        valokuvakansio.get(0).display();
    }
}