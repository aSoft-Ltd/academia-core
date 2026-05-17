package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
data class Credit(
    val feature: Feature,
    val amount: Map<Month, Int>,
)