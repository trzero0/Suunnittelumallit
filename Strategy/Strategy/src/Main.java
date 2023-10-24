import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");

        ListConverter listConverter = new ListConverterImpl();

        // Käytetään eri strategioita
        System.out.println("Every Item Strategy:");
        System.out.println(listConverter.convertList(myList, new EveryItemStrategy()));

        System.out.println("Every Second Item Strategy:");
        System.out.println(listConverter.convertList(myList, new EverySecondItemStrategy()));

        System.out.println("Every Third Item Strategy:");
        System.out.println(listConverter.convertList(myList, new EveryThirdItemStrategy()));
    }
}