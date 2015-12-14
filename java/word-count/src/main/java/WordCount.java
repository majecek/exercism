import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {

    private final Map<String, Integer> splitMap = new HashMap<>();

    public Map<String, Integer> Phrase(String word) {
        final Pattern pattern = Pattern.compile("\\w+");

        return Arrays.stream(word.split(" "))
            .filter(s -> {
                return !s.isEmpty();
            })
            .collect((Collectors.groupingBy(s -> s, Collectors.reducing(0, s -> 1, Integer::sum))));



        //        Matcher matcher = pattern.matcher(word.toLowerCase());
        //
        //        while (matcher.find()) {
        //            int wordCount = splitMap.get(matcher.group()) != null ? splitMap.get(matcher.group()) : 0;
        //            splitMap.put(matcher.group(), wordCount + 1);
        //        }
        //        return splitMap;
    }
}
