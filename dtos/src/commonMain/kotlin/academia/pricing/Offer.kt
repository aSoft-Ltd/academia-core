package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
data class Offer(
    val name: String,
    val feature: Feature,
    val details: String,
)