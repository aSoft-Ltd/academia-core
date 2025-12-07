package academia.admission

class OpportunityDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun applicants() = "$prefix/applicants"
    fun limit() = "$prefix/limit"
    fun payments() = "$prefix/payments"
    fun results() = "$prefix/results"
    fun requirements() = "$prefix/requirements"
    fun advertisements() = "$prefix/advertisement"
    fun interview() = "$prefix/interviews"
    val interview by lazy { InterviewDestinations(this.prefix, "interview") }
    fun routes() = "$prefix/*"
    fun isolated() = OpportunityDestinations("", root)
}