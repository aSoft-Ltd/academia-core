package academia.tooling

import kotlinx.serialization.Serializable

@Serializable
enum class RegistrationMethod {
    Email, Phone
}