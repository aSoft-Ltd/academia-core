package academia.profile

class ModuleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun programmes() = "${prefix}/programmes"
    fun modules() = "${prefix}/modules"
    fun stage() = "${prefix}/stage"
    val split by lazy { SplitDestinations(this.prefix, "split") }
    fun routes() = "$root/*"
    fun isolated() = ModuleDestinations("", root)
}