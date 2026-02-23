package academia.profile.school

class CampusesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun routes() = "$root/*"
    fun index() = list()
    fun list() = "$prefix/"
    fun uid(uid: String) = CampusDestinations(prefix, uid)
    fun isolated() = CampusesDestinations("", root)

    class CampusDestinations(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        fun index() = prefix
        fun curriculum() = "$prefix/curriculum"
        fun routes() = "$root/*"
        fun isolated() = CampusDestinations("", root)
    }
}