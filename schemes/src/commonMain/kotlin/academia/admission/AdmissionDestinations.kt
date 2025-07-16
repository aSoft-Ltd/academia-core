package academia.admission

class AdmissionDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun applicant() = "$prefix/applicants"
    fun opportunity() = "$prefix/opportunities"
    val profile by lazy { ProfileDestinations(this.prefix, "applicants/profile") }
}
