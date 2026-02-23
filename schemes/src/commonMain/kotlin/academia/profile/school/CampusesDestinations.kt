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
        fun curriculum() = CurriculaDestinations(prefix, "curricula")
        fun routes() = "$root/*"
        fun isolated() = CampusDestinations("", root)

        class CurriculaDestinations(prefix: String, private val root: String) {
            private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
            fun index() = prefix
            fun routes() = "$root/*"
            fun list() = prefix
            fun uid(uid: String) = "$prefix/$uid"
            fun isolated() = CurriculaDestinations("", root)
        }
    }
}