package uk.co.flaminscotsman.kolmafiamicrobenchmark

object TestCases {
    private val bees = listOf(
        "bubble bauble bow" to 6,
        "SongBoom&trade; BoomBox Box" to 4,
        "Bigger Bugfinder Blade" to 3,
        "Bugfinder Blade" to 2,
        "disco ball" to 1,
        "seal tooth" to 0,
        "" to 0,
    )

    private val glovers = listOf(
        "Argarggagarg's fang" to 6,
        "Grimacite goggles" to 4,
        "Gummi-Gnauga" to 3,
        "Knob Goblin tongs" to 2,
        "seal-clubbing club" to 1,
        "seal tooth" to 0,
        "" to 0,
    )

    private val ewes = listOf(
        "future drug: Muscularactum" to 6,
        "undamaged Unbreakable Umbrella" to 3,
        "Eau de Guaneau" to 3,
        "seal-clubbing club" to 2,
        "Gregarious Gregorian Smock" to 1,
        "seal tooth" to 0,
        "" to 0,
    )

    private val eyes = listOf(
        "Maiali Sifilitici Pinot Noir" to 9,
        "Inigo's Incantation of Inspiration" to 7,
        "tiny plastic Iiti Kitty" to 6,
        "ravioli hat" to 2,
        "seal-clubbing club" to 1,
        "batgut" to 0,
        "" to 0,
    )

    fun getCases(char: Char) = when (char) {
        'b' -> bees
        'g' -> glovers
        'i' -> eyes
        'u' -> ewes
        else -> throw RuntimeException("Unknown character $char")
    }
}