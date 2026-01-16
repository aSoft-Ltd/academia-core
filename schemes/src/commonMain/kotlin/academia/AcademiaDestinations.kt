package academia

import academia.accounts.AccountDestinations
import academia.admission.AdmissionDestinations
import academia.authentication.AuthenticationDestinations
import academia.blog.BlogDestinations
import academia.legal.LegalDestinations
import academia.payments.PaymentDestinations
import academia.profile.ProfileDestinations
import academia.registration.RegistrationDestinations
import academia.student.StudentDestinations
import academia.teachers.TeacherDestinations
import academia.users.UserDestinations
import academia.website.WebsiteDestinations

class AcademiaDestinations(private val prefix: String) { // e.g. "https://academia.co.tz, http://localhost:9090/v1"
    val outbox by lazy { AcademiaOutboxDestinations("$prefix/outbox") }
    val registration by lazy { RegistrationDestinations("$prefix/registration") }
    val authentication by lazy { AuthenticationDestinations("$prefix/authentication") }
    val legal by lazy { LegalDestinations("$prefix/legal") }
    val profile by lazy { ProfileDestinations(prefix, "profile") }
    val website by lazy { WebsiteDestinations(prefix, "website") }
    val blog by lazy { BlogDestinations(prefix, "blog") }
    val payment by lazy { PaymentDestinations(prefix, "payment") }
    val admissions by lazy { AdmissionDestinations(prefix, "admissions") }
    val users by lazy { UserDestinations(prefix, "users") }
    val students by lazy { StudentDestinations(prefix, "students") }
    val teachers by lazy { TeacherDestinations(prefix, "teachers") }
    val accounts by lazy { AccountDestinations(prefix, "accounts") }
    fun search(query: String) = "$prefix/search/$query"
    fun settings() = "$prefix/settings"
    fun toBase(base: String) = AcademiaDestinations(base)
}