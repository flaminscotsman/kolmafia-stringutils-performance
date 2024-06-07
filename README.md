# KoLMafia String Handling Benchmarks

A benchmark suite to compare the performance of different approaches to
count the number of instances of a case-insensitive character in
a string / if the string contains the character.

## Structure

There are 3 classes under test, `KotlinLetterUtils` which contains
different approaches to counting / testing contains; `JavaStreamLetterUtils`
which contains an implementation, and `JavaLetterUtils` which contains a Java
implementation for the highest performing count and contains method from
`KotlinLetterUtils`.

## Testing Methodology

Each benchmark calls the function under test with each of the currently
handled characters (b, g, i, u) for each named item in the KoLMafia item
database.  This comes out to ~45000 iterations per "operation".


## Results

Results from Eclipse Temurin-17.0.7+7 running on a 2021 M1 MacBook Pro

| Benchmark                                           | Mode  | Threads | Samples | Score       | Score Error (99.9%) | Unit  |
|-----------------------------------------------------|-------|---------|---------|-------------|---------------------|-------|
| JavaLetterUtilsBenchMark.Contains                   | thrpt | 4       | 6       | 9031.452181 | 800.965842          | ops/s |
| JavaLetterUtilsBenchMark.Count                      | thrpt | 4       | 6       | 4320.077471 | 110.106593          | ops/s |
| JavaStreamLetterUtilsBenchmark.Contains             | thrpt | 4       | 6       | 1038.529858 | 33.871498           | ops/s |
| JavaStreamLetterUtilsBenchmark.Count                | thrpt | 4       | 6       | 2011.533655 | 85.353167           | ops/s |
| KotlinContainsBenchmark.containsByChar              | thrpt | 4       | 6       | 6297.916380 | 178.359130          | ops/s |
| KotlinContainsBenchmark.containsByIndexOfAny        | thrpt | 4       | 6       | 4601.296659 | 129.469970          | ops/s |
| KotlinContainsBenchmark.containsByPattern           | thrpt | 4       | 6       | 2473.709581 | 114.643305          | ops/s |
| KotlinContainsBenchmark.containsByStringContains    | thrpt | 4       | 6       | 8223.353206 | 2562.182194         | ops/s |
| KotlinContainsBenchmark.containsByStringInverted    | thrpt | 4       | 6       | 6716.641838 | 3187.332452         | ops/s |
| KotlinCountBenchmark.countByChar                    | thrpt | 4       | 6       | 4409.035243 | 97.715518           | ops/s |
| KotlinCountBenchmark.countByInsensitiveLowerPattern | thrpt | 4       | 6       | 1153.940347 | 320.689433          | ops/s |
| KotlinCountBenchmark.countByInsensitiveUpperPattern | thrpt | 4       | 6       | 1154.217495 | 215.026430          | ops/s |
| KotlinCountBenchmark.countByPattern                 | thrpt | 4       | 6       | 1014.031989 | 422.830255          | ops/s |
