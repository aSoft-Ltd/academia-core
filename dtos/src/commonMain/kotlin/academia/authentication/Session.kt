package academia.authentication

import academia.registration.RegistrationMethod
import kotlinx.serialization.Serializable

@Serializable
data class Session(
    val school: School,
    val user: User
) {
    @Serializable
    data class School(
        val uid: String,
        val name: String
    )

    @Serializable
    data class User(
        val uid: String,
        val name: String,
        val account: String,
        val method: RegistrationMethod
    )
}