package academia.profile.school

class ProgramDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun stage(uid: String) = StageDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ProgramDestinations("", root)
}