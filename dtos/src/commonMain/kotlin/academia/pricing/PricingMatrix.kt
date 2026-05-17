package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
class PricingMatrix(
    val version: String,
    val packages: List<Package>,
    val credits: List<Credit>
)