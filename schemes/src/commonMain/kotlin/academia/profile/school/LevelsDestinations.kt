package academia.profile.school

class LevelsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun uid(uid: String) = LevelDestinations(this.prefix, uid)
    fun list() = prefix
    fun routes() = "$root/*"
    fun isolated() = LevelsDestinations("", root)
}