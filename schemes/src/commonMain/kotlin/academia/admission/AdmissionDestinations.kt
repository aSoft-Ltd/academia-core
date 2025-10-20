package academia.admission

import academia.admission.bulk.AdmittedDestinations
import academia.admission.bulk.EnrollDestinations
import academia.admission.bulk.RejectedDestinations
import academia.admission.bulk.RemindedDestinations

class AdmissionDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun enrolled() = "$prefix/enrolled"
    val enrolled by lazy { EnrollDestinations(this.prefix, "enrolled") }
    fun admitted() = "$prefix/admitted"
    val admitted by lazy { AdmittedDestinations(this.prefix, "admitted") }
    fun rejected() = "$prefix/rejected"
    val rejected by lazy { RejectedDestinations(this.prefix, "rejected") }
    fun reminded() = "$prefix/reminded"
    val reminded by lazy { RemindedDestinations(this.prefix, "reminded") }
    fun adverts() = "$prefix/adverts"
    fun applicants() = "$prefix/applicants"
    fun opportunities() = "$prefix/opportunities"
    val applicant by lazy { ApplicantDestinations(this.prefix, "applicants/profile") }
    val guardian by lazy { GuardianDestinations(this.prefix, "guardians") }
    val opportunity by lazy { OpportunityDestinations(this.prefix, "opportunity") }
}