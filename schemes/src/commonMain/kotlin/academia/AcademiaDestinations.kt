package academia

import academia.account.AccountDestinations
import academia.admission.AdmissionDestinations
import academia.authentication.AuthenticationDestinations
import academia.legal.LegalDestinations
import academia.registration.RegistrationDestinations
import academia.website.WebsiteDestinations

class AcademiaDestinations(private val base: String) {
    val outbox by lazy { AcademiaOutboxDestinations("$base/outbox") }
    val registration by lazy { RegistrationDestinations("$base/registration") }
    val authentication by lazy { AuthenticationDestinations("$base/authentication") }
    val legal by lazy { LegalDestinations("$base/legal") }
    val account by lazy { AccountDestinations("$base/account") }
    val website by lazy { WebsiteDestinations("$base/website") }
    val admission by lazy { AdmissionDestinations("$base/admission") }
    fun settings() = "$base/settings"
    fun toBase(base: String) = AcademiaDestinations(base)
}
