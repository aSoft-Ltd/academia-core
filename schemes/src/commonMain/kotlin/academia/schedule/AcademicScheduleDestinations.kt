package academia.schedule

class AcademicScheduleDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun calendar() = "$prefix/calendar"
    fun student(isOnboarding: Boolean = false) = "$prefix/students?isOnboarding=$isOnboarding"
    fun combination() = "$prefix/combination"
    fun programme() = "$prefix/programmes"
    fun module() = "$prefix/modules"
    fun graduate() = "$prefix/graduates"
    fun teachers(isOnboarding: Boolean = false) = "$prefix/teachers?isOnboarding=$isOnboarding"
    fun tutors(isOnboarding: Boolean = false) = "$prefix/tutors?isOnboarding=$isOnboarding"
    fun classes() = "$prefix/classes"
    fun isolated() = AcademicScheduleDestinations("", root)
}