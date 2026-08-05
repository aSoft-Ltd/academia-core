package academia.attendance

class AttendancesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun attendance(uid: String) = AttendanceDestinations(prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = AttendancesDestinations("", root)
}