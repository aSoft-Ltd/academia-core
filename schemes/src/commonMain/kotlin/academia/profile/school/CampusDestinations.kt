package academia.profile.school

class CampusDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "/$prefix"
    fun curriculums() = CurriculumsDestinations(prefix, "curriculums")
    fun contacts() = "$prefix/contacts"
    fun socials() = "$prefix/socials"
    fun payments() = "$prefix/payments"
    fun credits() = "$prefix/credits"
    fun rules() = "$prefix/rules"
    fun legal() = "$prefix/legal"
    fun routes() = "$root/*"
    fun isolated() = CampusDestinations("", root)
}