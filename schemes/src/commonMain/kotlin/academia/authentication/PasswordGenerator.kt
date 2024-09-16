package academia.authentication

import kotlin.random.Random

class PasswordGenerator(
    private val characters: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
) {
    fun generate(length: Int = 8): String = buildString {
        val pool = characters.shuffled(Random(length))
        repeat(length) { append(pool.random()) }
    }
}