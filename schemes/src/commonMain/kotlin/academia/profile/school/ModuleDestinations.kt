package academia.profile.school

class ModuleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/programmes"
    fun modules() = "${prefix}/modules"
    val programmes by lazy { ProgrammeDestinations(this.prefix, "programmes") }
    fun routes() = "$root/*"
    fun isolated() = ModuleDestinations("", root)
}