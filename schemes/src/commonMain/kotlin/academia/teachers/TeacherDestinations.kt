package academia.teachers

class TeacherDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun list() = "$prefix/list"
    val profile by lazy { ProfileDestinations(this.prefix, "list") }
}