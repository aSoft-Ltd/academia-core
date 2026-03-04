package academia.profile.school

class ClassStreamDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun subjects() = SubjectsDestinations(this.prefix, "subjects")
    fun fees() = FeesDestinations(this.prefix, "fees")
    fun routes() = "$root/*"
    fun isolated() = ClassStreamDestinations("", root)
}