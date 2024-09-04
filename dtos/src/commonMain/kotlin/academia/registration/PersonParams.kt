package academia.registration

import academia.tooling.RegistrationMethod
import kotlinx.serialization.Serializable

@Serializable
data class PersonParams(
    val name: String,
    val account: String,
    val gender: Gender,
    val method: RegistrationMethod
) {
    @Serializable
    enum class Gender {
        male, female
    }
}