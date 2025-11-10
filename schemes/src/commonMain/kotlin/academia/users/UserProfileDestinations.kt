package academia.users

class UserProfileDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/permissions"
    fun contacts() = "$prefix/Contacts"
    fun roles() = "$prefix/Roles"
    fun security() = "$prefix/Security"
    fun routes() = "$prefix/*"
    fun isolated() = UserProfileDestinations("", root)
}