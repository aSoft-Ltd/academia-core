package academia.profile

import academia.profile.school.CampusDestinations

class ProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val personal by lazy { Personal(this.prefix, "personal") }
    val school by lazy { School(this.prefix, "school") }
    fun routes() = "$root/*"
    fun isolated() = ProfileDestinations("", root)

    class School(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        fun index() = prefix
        fun campuses() = "$prefix/campuses"
        fun contacts() = "$prefix/contacts"
        fun preferences() = "$prefix/preferences"
        fun social() = "$prefix/social"
        fun security() = "$prefix/security"
        fun payments() = "$prefix/payments"
        fun address() = "$prefix/address"
        fun credits() = "$prefix/credits"
        fun domain() = "$prefix/domain"
        fun academics() = "$prefix/academics"
        fun fee() = "$prefix/fee"
        fun rules() = "$prefix/rules"
        fun legal() = "$prefix/legal"
        val campus by lazy { CampusDestinations(this.prefix, "campus") }
        fun routes() = "$root/*"
        fun isolated() = School("", root)
    }

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
}