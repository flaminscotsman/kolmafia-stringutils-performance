package uk.co.flaminscotsman.kolmafiamicrobenchmark

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class KotlinCountTests {
    @TestFactory
    fun beeTests() = generateTests('b')

    @TestFactory
    fun gLoverTests() = generateTests('g')

    @TestFactory
    fun eyesTests() = generateTests('i')

    @TestFactory
    fun ewesTests() = generateTests('u')

    private fun generateTests(char: Char): List<DynamicTest> {
        val tester = when (char) {
            'b' -> KotlinLetterUtils.B
            'g' -> KotlinLetterUtils.G
            'i' -> KotlinLetterUtils.I
            'u' -> KotlinLetterUtils.U
            else -> throw RuntimeException("Unknown character $char")
        }

        return TestCases.getCases(char).flatMap { (string, count) -> listOf(
                DynamicTest.dynamicTest("Test if \"$string\" contains $count $char's using countByChar") {
                    assertEquals(tester.countByChar(string), count)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $count $char's using countByPattern") {
                    assertEquals(tester.countByPattern(string), count)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $count $char's using countByInsensitiveLowerPattern") {
                    assertEquals(tester.countByInsensitiveLowerPattern(string), count)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $count $char's using countByInsensitiveUpperPattern") {
                    assertEquals(tester.countByInsensitiveUpperPattern(string), count)
                },
        )}
    }
}