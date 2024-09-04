package academia.authentication

import kotlinx.serialization.Serializable

@Serializable
data class SignInParams(
    var account: String?,
    var password: String?
)