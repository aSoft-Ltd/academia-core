package academia.profile.school

class LevelDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun programmes() = ProgrammesDestinations(this.prefix, "programmes")
    fun courses() = CoursesDestinations(this.prefix, "modules")
    fun stages() = StagesDestinations(this.prefix, "stages")
    fun list() = "$prefix/levels"
    fun routes() = "$root/*"
    fun isolated() = LevelDestinations("", root)
}