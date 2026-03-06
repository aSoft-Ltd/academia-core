package academia.profile.school

class CombinationFeesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun isolated() = CombinationFeesDestinations("", root)
}