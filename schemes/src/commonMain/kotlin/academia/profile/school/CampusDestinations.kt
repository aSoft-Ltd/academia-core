package academia.profile.school

class CampusDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun curriculum() = CurriculaDestinations(prefix, "curricula")
    fun routes() = "$root/*"
    fun isolated() = CampusDestinations("", root)
}