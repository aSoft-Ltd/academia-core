package academia.combination

class CombinationDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun level(uid: String) = CombinationLevelDestinations(prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = CombinationDestinations("", root)
}