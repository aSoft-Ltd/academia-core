package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class Suggestion(
    val green: Boolean,
    val name: String,
    val proposed: List<String>,
)