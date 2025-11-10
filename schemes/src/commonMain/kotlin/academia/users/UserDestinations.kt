package academia.users

class UserDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/insights"
    fun list() = "$prefix/list"
    fun roles() = "$prefix/roles"
    val profile by lazy { UserProfileDestinations(this.prefix, "users/{uid}") }
    fun routes() = "$prefix/*"
    fun isolated() = UserDestinations("", root)
}