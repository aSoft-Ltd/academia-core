package academia.pricing

import kotlinx.serialization.Serializable

@Serializable
data class Package(
    val name: String,
    val amount: Map<Month, Int>,
    val offerings: Map<Month, List<Offering>>
) {
    @Serializable
    class Offering(
        val feature: Feature,
        val credits: CostFunc
    )
}