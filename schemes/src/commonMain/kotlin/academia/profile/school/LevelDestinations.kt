package academia.profile.school

class LevelDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(level: String) = "$prefix/$level"
    val module by lazy { ModuleDestinations(this.prefix, "module") }
    fun routes() = "$root/*"
    fun isolated() = LevelDestinations("", root)
}