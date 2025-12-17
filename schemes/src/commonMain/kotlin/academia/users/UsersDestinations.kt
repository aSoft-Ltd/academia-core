package academia.users

class UsersDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/insights"
    fun users() = "$prefix/all"
    val profile by lazy { UserProfileDestinations(this.prefix, "user") }
    fun roles() = "$prefix/roles"
    fun routes() = "$prefix/*"
    fun isolated() = UsersDestinations("", root)
}