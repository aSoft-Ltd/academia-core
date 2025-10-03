package academia.admission.bulk

class RejectedDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/criteria"
    fun candidates() = "$prefix/candidates"
    fun routes() = "$prefix/*"
    fun isolated() = RejectedDestinations("", root)
}