package academia.authentication

import heimdal.authentication.Token
import kotlinx.serialization.Serializable

@Serializable
data class AcademiaToken(
    val token: String
) : SignInResult {

//    @Serializable
//    data class School(
//        val uid: String,
//        val name: String,
//        val brand: Int,
//        val domain: String,
//        val logo: String?,
//        val campuses: List<Campus>
//    )

//    @Serializable
//    data class Campus(
//        val uid: String,
//        val name: String
//    )

    private val tkn by lazy { Token(token) }

    val schools by lazy { tkn.businesses }
    val school by lazy { tkn.businesses.first { it.uid == tkn.business } }
    val user by lazy { tkn.user }
}