package uk.co.flaminscotsman.kolmafiamicrobenchmark;

public class JavaLetterUtils {
    public static boolean ContainsB(String string) {
        return Contains(string, 'b', 'B');
    }

    public static int CountB(String string) {
        return Count(string, 'b', 'B');
    }

    public static boolean ContainsG(String string) {
        return Contains(string, 'g', 'G');
    }

    public static int CountG(String string) {
        return Count(string, 'g', 'G');
    }

    public static boolean ContainsI(String string) {
        return Contains(string, 'i', 'I');
    }

    public static int CountI(String string) {
        return Count(string, 'i', 'I');
    }

    public static boolean ContainsU(String string) {
        return Contains(string, 'u', 'U');
    }

    public static int CountU(String string) {
        return Count(string, 'u', 'U');
    }

    private static boolean Contains(String haystack, char lower, char upper) {
        return haystack.indexOf(lower) >= 0 || haystack.indexOf(upper) >= 0;
    }

    private static int Count(String haystack, char lower, char upper) {
        int result = 0;
        int length = haystack.length();
        for (int i = 0; i < length; i++) {
            char c = haystack.charAt(i);
            if (c == lower || c == upper) {
                result++;
            }
        }
        return result;
    }
}
