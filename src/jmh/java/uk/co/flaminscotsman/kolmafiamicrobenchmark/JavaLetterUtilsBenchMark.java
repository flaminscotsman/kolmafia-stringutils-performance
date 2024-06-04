package uk.co.flaminscotsman.kolmafiamicrobenchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class JavaLetterUtilsBenchMark {
    @Benchmark
    public boolean Contains() {
        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= JavaLetterUtils.ContainsB(name);
            result ^= JavaLetterUtils.ContainsG(name);
            result ^= JavaLetterUtils.ContainsI(name);
            result ^= JavaLetterUtils.ContainsU(name);
        }
        return result;
    }

    @Benchmark
    public int Count() {
        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += JavaLetterUtils.CountB(name);
            count += JavaLetterUtils.CountG(name);
            count += JavaLetterUtils.CountI(name);
            count += JavaLetterUtils.CountU(name);
        }
        return count;
    }
}
