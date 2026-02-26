package academia.profile.school

class CurriculumDestination(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun levels() = LevelsDestinations(this.prefix, "levels")
    fun routes() = "/$root/*"
    fun isolated() = CurriculumDestination("", root)
}