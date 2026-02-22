package academia.profile.school

class ModuleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(module: String) = "$prefix/$module"
    fun programmes() = "${prefix}/programmes"
    fun modules() = "${prefix}/modules"
    val stage by lazy { StageDestinations(this.prefix, "stage") }
    fun routes() = "$root/*"
    fun isolated() = ModuleDestinations("", root)
}