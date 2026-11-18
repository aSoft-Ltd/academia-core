package academia.programmes

import academia.classes.ClassesDestinations.ClassDestinations.SubjectDestinations
import academia.classes.SubjectUnitDestinations

class CourseSemesterDestinations(prefix: String, private val root: String) : SubjectUnitDestinations {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun detail(uid: String) = CourseDetailDestinations(prefix, uid)
    override fun subjects() = index()
    override fun subject(uid: String) = SubjectDestinations(prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = CourseSemesterDestinations("", root)
}