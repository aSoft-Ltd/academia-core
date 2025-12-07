package academia.authentication

import kotlinx.serialization.Serializable

@Serializable
data class SchoolDilemma(
    val token: String
) : SignInResult