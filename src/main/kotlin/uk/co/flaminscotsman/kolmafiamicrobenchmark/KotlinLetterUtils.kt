package uk.co.flaminscotsman.kolmafiamicrobenchmark

import java.util.regex.Pattern

class KotlinLetterUtils private constructor(
    private val lowercase: Char,
    private val uppercase: Char,
    private val pattern: Pattern,
    private val insensitiveLowerPattern: Pattern,
    private val insensitiveUpperPattern: Pattern
) {
    fun countByChar(source: String): Int = source.count { it == this.lowercase || it == this.uppercase }
    fun countByPattern(source: String): Int = this.pattern.matcher(source).results().count().toInt()
    fun countByInsensitiveLowerPattern(source: String): Int = this.insensitiveLowerPattern.matcher(source).results().count().toInt()
    fun countByInsensitiveUpperPattern(source: String): Int = this.insensitiveUpperPattern.matcher(source).results().count().toInt()

    fun containsByChar(source: String): Boolean = source.any { it == this.lowercase || it == this.uppercase }
    fun containsByPattern(source: String): Boolean = source.contains(this.pattern.toRegex())
    fun containsByStringContains(source: String): Boolean = source.contains(this.lowercase) || source.contains(this.uppercase)
    fun containsByStringInverted(source: String): Boolean = source.contains(this.uppercase) || source.contains(this.lowercase)
    fun containsByIndexOfAny(source: String): Boolean = source.indexOfAny(charArrayOf(this.lowercase, this.uppercase)) >= 0

    companion object {
        val B = KotlinLetterUtils(
            'b', 'B',
            Pattern.compile("[bB]"),
            Pattern.compile("b", Pattern.CASE_INSENSITIVE),
            Pattern.compile("B", Pattern.CASE_INSENSITIVE)
        )
        val G = KotlinLetterUtils(
            'g', 'G',
            Pattern.compile("[gG]"),
            Pattern.compile("g", Pattern.CASE_INSENSITIVE),
            Pattern.compile("G", Pattern.CASE_INSENSITIVE)
        )
        val I = KotlinLetterUtils(
            'i', 'I',
            Pattern.compile("[iI]"),
            Pattern.compile("i", Pattern.CASE_INSENSITIVE),
            Pattern.compile("I", Pattern.CASE_INSENSITIVE)
        )
        val U = KotlinLetterUtils(
            'u', 'U',
            Pattern.compile("[uU]"),
            Pattern.compile("u", Pattern.CASE_INSENSITIVE),
            Pattern.compile("U", Pattern.CASE_INSENSITIVE)
        )
    }
}