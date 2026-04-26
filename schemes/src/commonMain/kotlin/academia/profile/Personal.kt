package academia.profile

class Personal(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun contacts() = "$prefix/contacts"
    fun credits() = "$prefix/credits"
    fun preferences() = "$prefix/preferences"
    fun social() = "$prefix/social"
    fun security() = "$prefix/security"
    fun payments() = "$prefix/payments"
    fun activities() = "$prefix/activities"
    fun routes() = "$root/*"
    fun isolated() = Personal("", root)
}