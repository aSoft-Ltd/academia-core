package academia.schedule

class AcademicScheduleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun calendar() = "$prefix/calendar"
    fun student() = "$prefix/students"
    fun combination() = "$prefix/combination"
    fun programme() = "$prefix/programmes"
    fun module() = "$prefix/modules"
    fun graduate() = "$prefix/graduates"
    fun classes() = "$prefix/classes"
    fun isolated() = AcademicScheduleDestinations("", root)
}