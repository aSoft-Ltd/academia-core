package academia.profile.school

class SplitDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(split:String) = "$prefix/$split"
    fun routes() = "$root/*"
    fun isolated() = SplitDestinations("", root)
}