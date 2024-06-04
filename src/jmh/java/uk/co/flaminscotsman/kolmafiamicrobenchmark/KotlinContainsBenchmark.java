package uk.co.flaminscotsman.kolmafiamicrobenchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class KotlinContainsBenchmark {
    @Benchmark
    public boolean containsByChar() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= b.containsByChar(name);
            result ^= g.containsByChar(name);
            result ^= i.containsByChar(name);
            result ^= u.containsByChar(name);
        }
        return result;
    }

    @Benchmark
    public boolean containsByPattern() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= b.containsByPattern(name);
            result ^= g.containsByPattern(name);
            result ^= i.containsByPattern(name);
            result ^= u.containsByPattern(name);
        }
        return result;
    }

    @Benchmark
    public boolean containsByStringContains() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= b.containsByStringContains(name);
            result ^= g.containsByStringContains(name);
            result ^= i.containsByStringContains(name);
            result ^= u.containsByStringContains(name);
        }
        return result;
    }

    @Benchmark
    public boolean containsByStringInverted() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= b.containsByStringInverted(name);
            result ^= g.containsByStringInverted(name);
            result ^= i.containsByStringInverted(name);
            result ^= u.containsByStringInverted(name);
        }
        return result;
    }

    @Benchmark
    public boolean containsByIndexOfAny() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        boolean result = false;
        for (String name : ItemsLoader.Names) {
            result ^= b.containsByIndexOfAny(name);
            result ^= g.containsByIndexOfAny(name);
            result ^= i.containsByIndexOfAny(name);
            result ^= u.containsByIndexOfAny(name);
        }
        return result;
    }
}
