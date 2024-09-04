package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class ConfigurationParams(
    val account: String,
    val password: String
)