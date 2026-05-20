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
        val credits: CredFunc
    ) {
        fun label(): String {
            if (credits.v == 0 && credits.f == 0) return "Free ${feature.name.lowercase()}"
            if (credits.v == 0) return "${credits.f} ${feature.name}"
            if (credits.v == Int.MAX_VALUE) return "Unlimited ${feature.name.lowercase()}"
            return "${credits.f} ${feature.name} + ${credits.v} per student"
        }
    }
}