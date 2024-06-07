package uk.co.flaminscotsman.kolmafiamicrobenchmark

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class JavaStreamLetterUtilsTests {
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
            'b' -> JavaStreamLetterUtils::CountB
            'g' -> JavaStreamLetterUtils::CountG
            'i' -> JavaStreamLetterUtils::CountI
            'u' -> JavaStreamLetterUtils::CountU
            else -> throw RuntimeException("Unknown character $char")
        }
        val container = when (char) {
            'b' -> JavaStreamLetterUtils::ContainsB
            'g' -> JavaStreamLetterUtils::ContainsG
            'i' -> JavaStreamLetterUtils::ContainsI
            'u' -> JavaStreamLetterUtils::ContainsU
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