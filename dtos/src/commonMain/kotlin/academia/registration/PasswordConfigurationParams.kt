package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class PasswordConfigurationParams(
    val account: String,
    val password: String
)