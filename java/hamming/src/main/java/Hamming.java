public class Hamming {
    public static int compute(String a, String b) {
        int result = 0;

        if (a.length() != b.length()) {
            throw new IllegalArgumentException("Different sizes of arguments");
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
