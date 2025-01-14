package academia.admission

class AdmissionDestinations(private val base: String) {
    fun home() = base
    fun applicant() = "$base/applicants"
}
