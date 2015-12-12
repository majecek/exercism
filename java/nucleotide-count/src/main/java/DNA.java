import java.util.HashMap;
import java.util.Map;

public class DNA {

    private final Map<Character, Integer> dnaCount = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};

    public DNA(String dnaString) {
        dnaString.chars().mapToObj(i -> (char) i).forEach(c -> dnaCount.put(c, dnaCount.get(c) + 1));
    }

    public int count(char dnaCharacter) {
        try {
            return dnaCount.get(dnaCharacter);
        } catch (NullPointerException ne) {
            throw new IllegalArgumentException("Illegal nucleotide");
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return dnaCount;
    }
}
