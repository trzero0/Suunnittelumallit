import java.util.List;

public class ListConverterImpl implements ListConverter {
  
      public String convertList(List<String> list, Strategy strategy) {
        return strategy.listToString(list);
    }
}