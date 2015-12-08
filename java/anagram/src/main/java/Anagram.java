import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.common.base.CharMatcher;

public class Anagram {
    private final String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram;
    }

    public List<String> match(List<String> unModifiableCandidates) {
        List<String> candidates = new LinkedList<String>(unModifiableCandidates);
        for (char character : this.anagram.toCharArray()) {
            CharMatcher.is(character).countIn(anagram);

            for (Iterator<String> iter = candidates.iterator(); iter.hasNext(); ) {
                String candidate = iter.next();
                if (isWrongCandidate(character, candidate)) {
                    iter.remove();
                }
            }
        }
        return candidates;
    }

    private boolean isWrongCandidate(char character, String candidate) {
        return !((CharMatcher.is(character).matchesAnyOf(candidate.toUpperCase())
            || CharMatcher.is(character).matchesAnyOf(candidate.toLowerCase()))
            && this.anagram.length() == candidate.length()
            && !this.anagram.equalsIgnoreCase(candidate)
            && (CharMatcher.is(character).countIn(this.anagram.toLowerCase()) == CharMatcher.is(character).countIn(candidate.toLowerCase())
            && CharMatcher.is(character).countIn(this.anagram.toUpperCase()) == CharMatcher.is(character).countIn(candidate.toUpperCase())));
    }
}
