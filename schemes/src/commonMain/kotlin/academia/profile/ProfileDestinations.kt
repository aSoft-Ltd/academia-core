package academia.profile

class ProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val personal by lazy { Personal(this.prefix, "personal") }
    val school by lazy { SchoolProfileDestination(this.prefix, "school") }
    fun routes() = "$root/*"
    fun isolated() = ProfileDestinations("", root)
}