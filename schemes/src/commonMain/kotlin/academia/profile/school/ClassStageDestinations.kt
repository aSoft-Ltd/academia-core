package academia.profile.school

class ClassStageDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun stream() = ClassStreamsDestinations(this.prefix, "streams")
    fun combination() = ClassCombinationsDestinations(this.prefix, "combinations")
    fun routes() = "$root/*"
    fun isolated() = ClassStageDestinations("", root)
}