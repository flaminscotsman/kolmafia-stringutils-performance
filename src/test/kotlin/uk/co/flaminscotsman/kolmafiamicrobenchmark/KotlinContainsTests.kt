package uk.co.flaminscotsman.kolmafiamicrobenchmark

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class KotlinContainsTests {
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
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's using containsByChar") {
                    assertEquals(tester.containsByChar(string), count > 0)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's using containsByPattern") {
                    assertEquals(tester.containsByPattern(string), count > 0)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's using containsByStringContains") {
                    assertEquals(tester.containsByStringContains(string), count > 0)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's using containsByStringInverted") {
                    assertEquals(tester.containsByStringInverted(string), count > 0)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's using containsByIndexOfAny") {
                    assertEquals(tester.containsByIndexOfAny(string), count > 0)
                },
        )}
    }
}