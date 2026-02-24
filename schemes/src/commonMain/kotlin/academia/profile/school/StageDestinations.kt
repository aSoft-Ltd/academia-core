package academia.profile.school

class StageDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun split(uid: String) = SplitDestinations(this.prefix, "stage/$uid")
    fun routes() = "$root/*"
    fun isolated() = StageDestinations("", root)
}