package academia.authentication

import kotlinx.serialization.Serializable

@Serializable
data class AcademiaSession(
    val token: String
) : SignInResult {

    @Serializable
    data class School(
        val uid: String,
        val name: String,
        val brand: Int,
        val domain: String,
        val logo: String?,
        val campuses: List<Campus>
    )

    @Serializable
    data class Campus(
        val uid: String,
        val name: String
    )

    @Serializable
    data class User(
        val uid: String,
        val name: String,
        val email: String,
        val photo: String?,
    )

    val schools: List<School> by lazy { TODO() }
    val school: School by lazy { TODO() }
    val user: User by lazy { TODO() }

    val permissions: List<String> by lazy { TODO() }
}