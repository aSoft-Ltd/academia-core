package academia.admission

class AdmissionDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun enrollments() = "$prefix/enrolled"
    val enroll by lazy { EnrollDestinations(this.prefix, "enroll") }
    fun admitted() = "$prefix/admitted"
    val admitted by lazy { AdmittedDestinations(this.prefix, "admit") }
    fun applicants() = "$prefix/applicants"
    fun opportunities() = "$prefix/opportunities"
    val applicant by lazy { ApplicantDestinations(this.prefix, "applicants/profile") }
    val guardian by lazy { GuardianDestinations(this.prefix, "guardians") }
    val opportunity by lazy { OpportunityDestinations(this.prefix, "opportunity") }
}