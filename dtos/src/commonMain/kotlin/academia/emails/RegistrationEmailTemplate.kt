package academia.emails

import kotlinx.serialization.Serializable

@Serializable
sealed interface RegistrationEmailTemplate : EmailTemplate {

    @Serializable
    data class Verification(val code: String) : RegistrationEmailTemplate

    @Serializable
    data class Welcome(val school: String, val domain: String) : RegistrationEmailTemplate
}