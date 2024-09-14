package academia.authentication

import kotlinx.serialization.Serializable

@Serializable
data class SignInParam(
    var account: String?
)
