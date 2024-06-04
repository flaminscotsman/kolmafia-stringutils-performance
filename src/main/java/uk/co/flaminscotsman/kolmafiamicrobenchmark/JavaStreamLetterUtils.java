package uk.co.flaminscotsman.kolmafiamicrobenchmark;

import java.util.stream.IntStream;

public class JavaStreamLetterUtils {
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
        return matches(haystack, lower, upper).findAny().isPresent();
    }

    private static int Count(String haystack, char lower, char upper) {
        return (int) matches(haystack, lower, upper).count();
    }

    private static IntStream matches(String haystack, char lower, char upper) {
        return haystack.chars().filter(c -> c == lower || c == upper);
    }
}
