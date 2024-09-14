package academia

import academia.authentication.AuthenticationLogMessages
import academia.registration.RegistrationLogMessages

class AcademiaLogMessages {
    val authentication by lazy { AuthenticationLogMessages() }
    val registration by lazy { RegistrationLogMessages() }
}