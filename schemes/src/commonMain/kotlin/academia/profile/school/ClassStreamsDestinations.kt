package academia.profile.school

class ClassStreamsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun uid(uid: String) = ClassStreamDestinations(this.prefix, uid)
    fun isolated() = ClassStreamsDestinations("", root)
}