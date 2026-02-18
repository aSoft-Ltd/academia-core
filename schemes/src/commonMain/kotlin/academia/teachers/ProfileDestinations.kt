package academia.teachers

class ProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(name: String) = "$prefix/$name"
    fun subjects() = "$prefix/subjects"
    fun classes() = "$prefix/classes"
    fun stream() = "$prefix/stream"
    fun attachments() = "$prefix/attachments"
    fun payments() = "$prefix/payments"
    fun activity() = "$prefix/activity"
    fun contacts() = "$prefix/contacts"
    fun permissions() = "$prefix/permissions"
    fun routes() = "$prefix/*"
    fun isolated() = ProfileDestinations("", root)
}