package uk.co.flaminscotsman.kolmafiamicrobenchmark;

import org.openjdk.jmh.annotations.*;

public class KotlinCountBenchmark {
    @Benchmark
    public int countByChar() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += b.countByChar(name);
            count += g.countByChar(name);
            count += i.countByChar(name);
            count += u.countByChar(name);
        }
        return count;
    }

    @Benchmark
    public int countByPattern() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += b.countByPattern(name);
            count += g.countByPattern(name);
            count += i.countByPattern(name);
            count += u.countByPattern(name);
        }
        return count;
    }

    @Benchmark
    public int countByInsensitiveLowerPattern() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += b.countByInsensitiveLowerPattern(name);
            count += g.countByInsensitiveLowerPattern(name);
            count += i.countByInsensitiveLowerPattern(name);
            count += u.countByInsensitiveLowerPattern(name);
        }
        return count;
    }

    @Benchmark
    public int countByInsensitiveUpperPattern() {
        KotlinLetterUtils b = KotlinLetterUtils.Companion.getB();
        KotlinLetterUtils g = KotlinLetterUtils.Companion.getG();
        KotlinLetterUtils i = KotlinLetterUtils.Companion.getI();
        KotlinLetterUtils u = KotlinLetterUtils.Companion.getU();

        int count = 0;
        for (String name : ItemsLoader.Names) {
            count += b.countByInsensitiveUpperPattern(name);
            count += g.countByInsensitiveUpperPattern(name);
            count += i.countByInsensitiveUpperPattern(name);
            count += u.countByInsensitiveUpperPattern(name);
        }
        return count;
    }
}
