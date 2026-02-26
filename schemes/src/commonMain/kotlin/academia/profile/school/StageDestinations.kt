package academia.profile.school

class StageDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun splits() = SplitsDestinations(this.prefix, "splits")
    fun routes() = "$root/*"
    fun isolated() = StageDestinations("", root)
}