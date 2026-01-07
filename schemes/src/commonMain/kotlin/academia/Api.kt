package academia

import academia.authentication.AuthenticationApi
import academia.legal.LegalApi
import academia.registration.RegistrationScheme

interface Api : AcademiaScheme {

    val url: String

    @Deprecated("Use authentication instead") // TODO: Remove after we have managed to purge authentication from the API
    override val authentication: AuthenticationApi

    override val registration: RegistrationScheme

    override val auth: Auth
    val legal: LegalApi

    fun terminate()
}