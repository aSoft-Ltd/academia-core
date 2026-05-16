package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
data class Amount(
    val one: Int,
    val two: Int,
    val three: Int,
    val six: Int,
    val twelve: Int,
    val unlimited: Int
) {
    companion object {
        val Zero by lazy { Amount(0, 0, 0, 0, 0, 0) }
    }
}