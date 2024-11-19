package academia

import academia.account.AccountDestinations
import academia.authentication.AuthenticationDestinations
import academia.legal.LegalDestinations
import academia.registration.RegistrationDestinations

class AcademiaDestinations(private val base: String) {
    val outbox by lazy { AcademiaOutboxDestinations("$base/outbox") }
    val registration by lazy { RegistrationDestinations("$base/registration") }
    val authentication by lazy { AuthenticationDestinations("$base/authentication") }
    val legal by lazy { LegalDestinations("$base/legal") }
    val account by lazy { AccountDestinations("$base/account") }
    fun website() = "$base/website"
    fun settings() = "$base/settings"
    fun toBase(base: String) = AcademiaDestinations(base)
}