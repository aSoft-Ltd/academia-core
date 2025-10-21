package academia.admission

import academia.admission.bulk.AdmittedDestinations
import academia.admission.bulk.AdvertDestinations
import academia.admission.bulk.AttendedDestinations
import academia.admission.bulk.BookedDestinations
import academia.admission.bulk.EnrollDestinations
import academia.admission.bulk.InvitedDestinations
import academia.admission.bulk.RejectedDestinations
import academia.admission.bulk.RemindedDestinations

class AdmissionDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun invited() = "$prefix/invited"
    val invited by lazy { InvitedDestinations(this.prefix, "invited") }
    fun attended() = "$prefix/attended"
    val attended by lazy { AttendedDestinations(this.prefix, "attended") }
    fun booked() = "$prefix/booked"
    val booked by lazy { BookedDestinations(this.prefix, "booked") }
    fun enrolled() = "$prefix/enrolled"
    val enrolled by lazy { EnrollDestinations(this.prefix, "enrolled") }
    fun admitted() = "$prefix/admitted"
    val admitted by lazy { AdmittedDestinations(this.prefix, "admitted") }
    fun rejected() = "$prefix/rejected"
    val rejected by lazy { RejectedDestinations(this.prefix, "rejected") }
    fun reminded() = "$prefix/reminded"
    val reminded by lazy { RemindedDestinations(this.prefix, "reminded") }
    fun adverts() = "$prefix/adverts"
    val adverts by lazy { AdvertDestinations(this.prefix, "adverts") }
    fun applicants() = "$prefix/applicants"
    fun opportunities() = "$prefix/opportunities"
    val applicant by lazy { ApplicantDestinations(this.prefix, "applicants/profile") }
    val guardian by lazy { GuardianDestinations(this.prefix, "guardians") }
    val opportunity by lazy { OpportunityDestinations(this.prefix, "opportunity") }
}