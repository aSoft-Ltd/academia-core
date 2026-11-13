package academia.combination

import academia.attendance.AttendancesDestinations
import academia.classes.ClassUnitDestinations
import academia.classes.ClassesDestinations.ClassDestinations.StreamDestinations
import academia.classes.ClassesDestinations.ClassDestinations.SubjectDestinations

class CombinationLevelDestinations(prefix: String, private val root: String) : ClassUnitDestinations {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun students() = "$prefix/students"
    fun attendance() = AttendancesDestinations(prefix, "attendance")
    override fun subjects() = "$prefix/subjects"
    override fun subject(uid: String) = SubjectDestinations(this.prefix, "subjects/$uid")
    fun teachers() = "$prefix/teachers"
    override fun streams() = "$prefix/streams"
    override fun stream(uid: String) = StreamDestinations(this.prefix, "streams/$uid")
    fun fees() = "$prefix/fees"
    fun routes() = "$root/*"
    fun isolated() = CombinationLevelDestinations("", root)
}