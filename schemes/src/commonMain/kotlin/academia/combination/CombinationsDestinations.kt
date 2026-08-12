package academia.combination

class CombinationsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun combinations() = "$prefix/combinations"
    fun combination(uid: String) = CombinationDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = CombinationsDestinations("", root)
}