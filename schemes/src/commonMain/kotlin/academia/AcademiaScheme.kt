package academia

import academia.authentication.AuthenticationScheme
import academia.registration.RegistrationScheme

interface AcademiaScheme {
    @Deprecated("Use 'auth' property instead", ReplaceWith("auth"))
    val authentication: AuthenticationScheme

    // TODO: Consider renaming to 'authentication' after we have removed authentication for consistency
    val auth: Auth
    val registration: RegistrationScheme
}