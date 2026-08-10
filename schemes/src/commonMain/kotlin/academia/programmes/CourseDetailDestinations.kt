package academia.programmes

class CourseDetailDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun outline() = "$prefix/outline"
    fun programmes() = "$prefix/programmes"
    fun sessions() = "$prefix/sessions"
    fun questions() = "$prefix/questions"
    fun exams() = "$prefix/exams"
    fun routes() = "$root/*"
    fun isolated() = CourseDetailDestinations("", root)
}