package academia.profile

class ProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val personal by lazy { Personal(this.prefix, "personal") }
    val school by lazy { School(this.prefix, "school") }
    fun routes() = "$root/*"
    fun isolated() = ProfileDestinations("", root)

    class School(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        fun index() = prefix
        fun contacts() = "$prefix/contacts"
        fun social() = "$prefix/social"
        fun security() = "$prefix/security"
        fun payments() = "$prefix/payments"
        fun address() = "$prefix/address"
        fun credits() = "$prefix/credits"
        fun academics() = "$prefix/academics"
        fun fee() = "$prefix/fee"
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
