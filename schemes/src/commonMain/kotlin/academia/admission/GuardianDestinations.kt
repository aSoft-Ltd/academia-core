package academia.admission

class GuardianDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun payments() = "$prefix/payments"
    fun attachments() = "$prefix/attachments"
    fun conversations() = "$prefix/conversations"
    fun activities() = "$prefix/activities"
    fun requirements() = "$prefix/requirements"
    fun limits() = "$prefix/limits"
    fun routes() = "$prefix/*"
    fun isolated() = GuardianDestinations("", root)
}
