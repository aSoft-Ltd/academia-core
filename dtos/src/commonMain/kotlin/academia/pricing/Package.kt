package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
data class Package(
    val name: String,
    val offerings: List<Offer>,
    val amount: Map<Month, Int>
)