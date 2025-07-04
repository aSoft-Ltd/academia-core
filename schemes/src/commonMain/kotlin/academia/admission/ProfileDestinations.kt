package academia.admission

class ProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun guardians() = "$prefix/guardians"
    fun results() = "$prefix/results"
    fun payments() = "$prefix/payments"
    fun attachments() = "$prefix/attachments"
    fun conversations() = "$prefix/conversations"
    fun activity() = "$prefix/activity"
    fun routes() = "$prefix/*"
    fun isolated() = ProfileDestinations("", root)
}
