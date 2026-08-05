package academia.attendance

class AttendanceDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun present() = "$prefix/present"
    fun absent() = "$prefix/absent"
    fun routes() = "$root/*"
    fun isolated() = AttendanceDestinations("", root)
}