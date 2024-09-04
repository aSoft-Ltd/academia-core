package academia

import academia.authentication.AuthenticationScheme
import academia.registration.RegistrationScheme

interface AcademiaScheme {
    val authentication: AuthenticationScheme
    val registration: RegistrationScheme
}