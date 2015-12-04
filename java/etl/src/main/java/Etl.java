import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> scrabbleDataset = new HashMap<String, Integer>();

        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            Integer points = entry.getKey();
            List<String> characters = entry.getValue();

            for (String character : characters) {
                scrabbleDataset.put(character.toLowerCase(), points);
            }
        }

        return scrabbleDataset;
    }
}
