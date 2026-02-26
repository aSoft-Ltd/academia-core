package academia.profile.school

class ProgrammeDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun stage(uid: String) = StageDestinations(this.prefix, uid)
    fun stages() = StagesDestinations(this.prefix, "stages")
    fun routes() = "$root/*"
    fun isolated() = ProgrammeDestinations("", root)
}