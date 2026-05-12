package academia.schedule


class AcademicSchedulesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun schedule(uid: String) = AcademicScheduleDestinations(this.prefix, uid)
    fun isolated() = AcademicSchedulesDestinations("", root)
}