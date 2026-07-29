package academia.programmes

class ProgrammeDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun students() = "$prefix/students"
    fun courses() = "$prefix/courses"
    fun tutors() = "$prefix/tutors"
    fun attendance() = "$prefix/attendance"
    fun routes() = "$root/*"
    fun isolated() = ProgrammeDestinations("", root)
}