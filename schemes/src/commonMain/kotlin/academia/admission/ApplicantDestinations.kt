package academia.admission

class ApplicantDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun guardians() = "$prefix/guardians"
    fun results() = "$prefix/results"
    fun transactions() = "$prefix/transactions"
    fun attachments() = "$prefix/attachments"
    fun conversations() = "$prefix/conversations"
    fun activities() = "$prefix/activities"
    fun contacts() = "$prefix/contacts"
    fun invoices() = "$prefix/invoices"
    fun routes() = "$prefix/*"
    fun isolated() = ApplicantDestinations("", root)
}