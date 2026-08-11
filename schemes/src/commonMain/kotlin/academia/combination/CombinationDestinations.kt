package academia.combination

class CombinationDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun combinations() = "$prefix/combinations"
    fun routes() = "$root/*"
    fun isolated() = CombinationDestinations("", root)
}