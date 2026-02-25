package academia.profile.school

class ProgrammesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun uid(uid: String) = ProgrammeDestinations(this.prefix, uid)
    fun list() = prefix
    fun routes() = "$root/*"
    fun isolated() = ProgrammesDestinations("", root)
}