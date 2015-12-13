import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        return old.entrySet().stream()
            .flatMap(e -> e.getValue().stream().map(s -> new AbstractMap.SimpleEntry<>(s.toLowerCase(), e.getKey())))
            .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    }
}
