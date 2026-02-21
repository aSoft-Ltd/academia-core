package academia.profile.school

class StageDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(stage: String) = "$prefix/$stage"
    val split by lazy { SplitDestinations(this.prefix, "split") }
    fun routes() = "$root/*"
    fun isolated() = StageDestinations("", root)
}