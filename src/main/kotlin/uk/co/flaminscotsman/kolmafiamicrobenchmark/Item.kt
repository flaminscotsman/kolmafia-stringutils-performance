package uk.co.flaminscotsman.kolmafiamicrobenchmark

import java.io.InputStream

data class Item(
    val id: Int,
    val name: String?,
    val descId: Int?,
    val image: String?,
    val uses: List<String>,
    val access: List<String>,
    val autosell: Int?,
    val plural: String?
) {
    companion object Factory {
        fun readAll(input: InputStream): List<Item> = input
            .bufferedReader()
            .lineSequence()
            .filter { it.isNotBlank() }
            .filterNot { it.startsWith('#') }
            .map { tryParse(it) }
            .filterNotNull()
            .toList()

        private fun tryParse(raw: String): Item?  {
            val parts = raw.trimEnd().split('\t')
            return when (parts.size) {
                1 -> Item(parts[0].toInt(10), null, null, null, emptyList(), emptyList(), null, null)
                7 -> Item(
                    parts[0].toInt(10),
                    parts[1],
                    parts[2].toInt(10),
                    parts[3],
                    parts[4].split(", "),
                    parts[5].split(','),
                    parts[6].toInt(10),
                    null
                )
                8 -> Item(
                    parts[0].toInt(10),
                    parts[1],
                    parts[2].toInt(10),
                    parts[3],
                    parts[4].split(", "),
                    parts[5].split(','),
                    parts[6].toInt(10),
                    parts[7]
                )
                else -> null
            }
        }
    }
}