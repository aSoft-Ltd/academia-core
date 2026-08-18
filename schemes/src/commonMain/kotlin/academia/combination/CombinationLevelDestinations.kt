package academia.combination

import academia.attendance.AttendancesDestinations

class CombinationLevelDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun students() = "$prefix/students"
    fun attendance() = AttendancesDestinations(prefix, "attendance")
    fun subjects() = "$prefix/subjects"
    fun teachers() = "$prefix/teachers"
    fun streams() = "$prefix/streams"
    fun fees() = "$prefix/fees"
    fun routes() = "$root/*"
    fun isolated() = CombinationLevelDestinations("", root)
}