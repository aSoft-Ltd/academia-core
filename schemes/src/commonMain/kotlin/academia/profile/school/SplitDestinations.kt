package academia.profile.school

class SplitDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun courses() = SplitModulesDestinations(this.prefix, "modules")
    fun groups() = SplitGroupsDestinations(this.prefix, "groups")
    fun fees() = SplitFeesDestinations(this.prefix, "fees")
    fun isolated() = SplitDestinations("", root)
}