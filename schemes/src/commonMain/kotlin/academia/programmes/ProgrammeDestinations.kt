package academia.programmes

class ProgrammeDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun students(stage: String) = "$prefix/$stage/students"
    fun courses(stage: String) = "$prefix/$stage/courses"
    fun tutors(stage: String) = "$prefix/$stage/tutors"
    fun attendance(stage: String) = "$prefix/$stage/attendance"
    fun fees(stage: String) = "$prefix/$stage/fees"
    fun routes() = "$root/*"
    fun isolated() = ProgrammeDestinations("", root)
}