package academia

import academia.authentication.AuthenticationDestinations
import academia.registration.RegistrationDestinations

class AcademiaDestinations(base: String) {
    val outbox by lazy { AcademiaOutboxDestinations("$base/outbox") }
    val registration by lazy { RegistrationDestinations("$base/registration") }
    val authentication by lazy { AuthenticationDestinations("$base/authentication") }
    fun toBase(base: String) = AcademiaDestinations(base)
}