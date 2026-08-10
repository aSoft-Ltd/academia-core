package academia.programmes

class CourseSemesterDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun detail(uid: String) = CourseDetailDestinations(prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = CourseSemesterDestinations("", root)
}