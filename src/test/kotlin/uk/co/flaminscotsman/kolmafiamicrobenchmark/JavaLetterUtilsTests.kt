package uk.co.flaminscotsman.kolmafiamicrobenchmark

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class JavaLetterUtilsTests {
    @TestFactory
    fun beeTests() = generateTests('b')

    @TestFactory
    fun gLoverTests() = generateTests('g')

    @TestFactory
    fun eyesTests() = generateTests('i')

    @TestFactory
    fun ewesTests() = generateTests('u')

    private fun generateTests(char: Char): List<DynamicTest> {
        val counter = when (char) {
            'b' -> JavaLetterUtils::CountB
            'g' -> JavaLetterUtils::CountG
            'i' -> JavaLetterUtils::CountI
            'u' -> JavaLetterUtils::CountU
            else -> throw RuntimeException("Unknown character $char")
        }
        val container = when (char) {
            'b' -> JavaLetterUtils::ContainsB
            'g' -> JavaLetterUtils::ContainsG
            'i' -> JavaLetterUtils::ContainsI
            'u' -> JavaLetterUtils::ContainsU
            else -> throw RuntimeException("Unknown character $char")
        }

        return TestCases.getCases(char).flatMap { (string, count) -> listOf(
                DynamicTest.dynamicTest("Test if \"$string\" contains $char's") {
                    assertEquals(container(string), count > 0)
                },
                DynamicTest.dynamicTest("Test if \"$string\" contains $count $char's") {
                    assertEquals(counter(string), count)
                }
        )}
    }
}