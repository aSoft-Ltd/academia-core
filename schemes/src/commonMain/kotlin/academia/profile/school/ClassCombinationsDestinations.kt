package academia.profile.school

class ClassCombinationsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun uid(uid: String) = ClassCombinationDestinations(this.prefix, uid)
    fun isolated() = ClassCombinationsDestinations("", root)
}