import java.util.stream.IntStream;

public class Hamming {
    public static int compute(String firstStrand, String secondStrand) {

        if (firstStrand.length() != secondStrand.length()) {
            throw new IllegalArgumentException("Different sizes of arguments");
        }

       return (int)IntStream.range(0, firstStrand.length())
                    .filter(i -> firstStrand.charAt(i) != secondStrand.charAt(i))
                    .count();
    }
}
