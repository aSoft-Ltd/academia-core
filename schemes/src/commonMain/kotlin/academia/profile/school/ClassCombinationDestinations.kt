package academia.profile.school

class ClassCombinationDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun subjects() = CombinationSubjectsDestinations(this.prefix, "subjects")
    fun fees() = CombinationFeesDestinations(this.prefix, "fees")
    fun streams() = CombinationStreamsDestinations(this.prefix, "streams")
    fun isolated() = ClassCombinationDestinations("", root)
}