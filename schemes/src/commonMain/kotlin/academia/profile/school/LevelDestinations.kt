package academia.profile.school

class LevelDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/level"
    fun uid(uid: String) = ModuleDestinations(this.prefix, "level/$uid")
    fun routes() = "$root/*"
    fun isolated() = LevelDestinations("", root)
}