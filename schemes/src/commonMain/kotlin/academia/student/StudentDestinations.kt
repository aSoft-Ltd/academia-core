package academia.student


class StudentDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun students() = "$prefix/list"
    fun guardians() = "$prefix/guardians"
    fun sick() = "$prefix/sick"
    fun absent() = "$prefix/absent"
    val profile by lazy { ProfileDestinations(this.prefix, "list") }
}