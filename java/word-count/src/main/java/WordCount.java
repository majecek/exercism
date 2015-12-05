import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    private final Map<String, Integer> splitMap = new HashMap<>();

    public Map<String, Integer> Phrase(String word) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(word.toLowerCase());

        while (matcher.find()) {
            int wordCount = splitMap.get(matcher.group()) != null ? splitMap.get(matcher.group()) : 0;
            splitMap.put(matcher.group(), wordCount + 1);
        }
        return splitMap;
    }
}
