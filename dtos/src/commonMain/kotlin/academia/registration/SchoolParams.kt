package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class SchoolParams(
    val name: String,
    val domain: String,
    val color: String
)