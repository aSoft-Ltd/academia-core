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
            fun curriculum() = "$prefix/curriculum"
            fun contacts() = "$prefix/contacts"
            fun social() = "$prefix/social"
            fun payments() = "$prefix/payments"
            fun credits() = "$prefix/credits"
            fun rules() = "$prefix/rules"
            fun legal() = "$prefix/legal"
            fun list() = prefix
            fun uid(uid: String) = LevelDestinations(this.prefix, uid)
            fun isolated() = CurriculaDestinations("", root)
        }
    }
}