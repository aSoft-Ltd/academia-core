package academia

import academia.authentication.AuthenticationApi
import academia.legal.LegalApi
import academia.registration.Registration
import academia.registration.RegistrationScheme

interface Api : AcademiaScheme {

    val url: String

    @Deprecated("Use authentication instead") // TODO: Remove after we have managed to purge authentication from the API
    override val authentication: AuthenticationApi

    @Deprecated("user registration instead") // TODO: Remove after we have managed to purge registration from the API
    override val registration: RegistrationScheme

    // TODO: Rename to registration after we have managed to purge registration from the API
    val register: Registration

    // TODO: Rename to authentication after we have managed to purge authentication from the API
    override val auth: Auth
    
    val legal: LegalApi

    fun terminate()
}