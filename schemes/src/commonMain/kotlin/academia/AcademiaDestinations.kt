package academia

import academia.account.AccountDestinations
import academia.admission.AdmissionDestinations
import academia.authentication.AuthenticationDestinations
import academia.blog.BlogDestinations
import academia.legal.LegalDestinations
import academia.registration.RegistrationDestinations
import academia.website.WebsiteDestinations

class AcademiaDestinations(private val prefix: String) { // e.g. "https://academia.co.tz, http://localhost:9090/v1"
    val outbox by lazy { AcademiaOutboxDestinations("$prefix/outbox") }
    val registration by lazy { RegistrationDestinations("$prefix/registration") }
    val authentication by lazy { AuthenticationDestinations("$prefix/authentication") }
    val legal by lazy { LegalDestinations("$prefix/legal") }
    val account by lazy { AccountDestinations(prefix, "account") }
    val website by lazy { WebsiteDestinations(prefix, "website") }
    val blog by lazy { BlogDestinations(prefix, "blog") }
    val admissions by lazy { AdmissionDestinations("$prefix/admissions") }
    fun search(query: String) = "$prefix/search/$query"
    fun settings() = "$prefix/settings"
    fun toBase(base: String) = AcademiaDestinations(base)
}
