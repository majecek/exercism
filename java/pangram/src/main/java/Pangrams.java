/**
 * Created by marek on 28/06/16.
 */
public class Pangrams {
    public static boolean isPangram(String string) {
        if (string.length() <= 0)
            return false;

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for ( char alpha: alphabet) {
            if (!string.toLowerCase().contains(String.valueOf(alpha).toLowerCase()) ) {
                return false;
            }
        }

        return true;
    }
}
