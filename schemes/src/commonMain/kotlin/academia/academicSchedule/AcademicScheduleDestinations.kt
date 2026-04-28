package academia.academicSchedule

class AcademicScheduleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun grades() = "$prefix/grades"
    fun isolated() = AcademicScheduleDestinations("", root)
}