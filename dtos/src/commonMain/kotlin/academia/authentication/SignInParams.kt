package academia.authentication

import kotlinx.serialization.Serializable

@Serializable
data class SignInParams(
    val account: String,
    val password: String
)