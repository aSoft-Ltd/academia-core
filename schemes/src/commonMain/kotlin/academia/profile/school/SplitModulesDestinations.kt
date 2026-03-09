package academia.profile.school

class SplitModulesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun isolated() = SplitModulesDestinations("", root)
}