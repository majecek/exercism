import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    private final Map<String, Integer> splitMap = new HashMap<>();

    public Map<String, Integer> Phrase(String word) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            int wordCount = splitMap.get(matcher.group().toLowerCase()) != null ? splitMap.get(matcher.group().toLowerCase()) : 0;
            splitMap.put(matcher.group().toLowerCase(), wordCount + 1);
        }
        return splitMap;
    }
}
