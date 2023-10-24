import java.util.List;
public class EveryThirdItemStrategy implements Strategy{

    public String listToString(List<String> list) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
          result.append(list.get(i)).append("\n");

            if (i % 3 == 2) {
                result.append("\n");
            }
        }
        return result.toString();
    }

}
