package academia.authentication

import heimdal.authentication.Token
import kotlinx.serialization.Serializable

@Serializable
data class AcademiaToken(val token: String) : SignInResult {
    private val tkn by lazy { Token(token) }

    val schools by lazy { tkn.businesses }
    val school by lazy { tkn.businesses.first { it.uid == tkn.business } }
    val user by lazy { tkn.user }
}