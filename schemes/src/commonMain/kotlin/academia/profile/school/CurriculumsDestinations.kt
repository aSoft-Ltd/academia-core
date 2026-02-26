package academia.profile.school

class CurriculumsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "/$prefix"
    fun routes() = "$root/*"
    fun contacts() = "$prefix/contacts"
    fun social() = "$prefix/social"
    fun payments() = "$prefix/payments"
    fun credits() = "$prefix/credits"
    fun rules() = "$prefix/rules"
    fun legal() = "$prefix/legal"
    fun list() = prefix
    fun uid(uid: String) = CurriculumDestination(this.prefix, uid)
    fun isolated() = CurriculumsDestinations("", root)
}