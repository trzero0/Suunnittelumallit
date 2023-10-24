import java.util.List;

public class EverySecondItemStrategy implements Strategy {
        
        public String listToString(List<String> list) {
            
            StringBuilder result = new StringBuilder();


            for (int i = 0; i < list.size(); i++) {
              result.append(list.get(i)).append("\n");

                if (i % 2 == 1) {
                    result.append("\n");
                }
            }
            return
            result.toString();
        }
    



}
