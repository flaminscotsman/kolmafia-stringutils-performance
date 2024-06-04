package uk.co.flaminscotsman.kolmafiamicrobenchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class JavaStreamLetterUtilsBenchmark {
    @Benchmark
    public boolean Contains() {
        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= JavaStreamLetterUtils.ContainsB(name);
            result ^= JavaStreamLetterUtils.ContainsG(name);
            result ^= JavaStreamLetterUtils.ContainsI(name);
            result ^= JavaStreamLetterUtils.ContainsU(name);
        }
        return result;
    }

    @Benchmark
    public int Count() {
        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += JavaStreamLetterUtils.CountB(name);
            count += JavaStreamLetterUtils.CountG(name);
            count += JavaStreamLetterUtils.CountI(name);
            count += JavaStreamLetterUtils.CountU(name);
        }
        return count;
    }
}
