package academia.users

class UserDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/insights"
    fun users() = "$prefix/users"
    val profile by lazy { UserProfileDestinations("", "user") }
    fun roles() = "$prefix/roles"
    fun routes() = "$prefix/*"
    fun isolated() = UserDestinations("", root)
}