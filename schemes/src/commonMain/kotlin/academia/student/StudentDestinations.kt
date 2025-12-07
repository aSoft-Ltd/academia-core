package academia.student


class StudentDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun dashboard() = "$prefix/dashboard"
    fun list() = "$prefix/list"
    fun guardians() = "$prefix/guardians"
    fun routes() = "$root/*"
    fun isolated() = StudentDestinations("", root)
}