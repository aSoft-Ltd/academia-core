package academia.programmes

class ProgrammesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun programmes() = "$prefix/programmes"
    fun programme(uid: String) = ProgrammeDestinations(prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ProgrammesDestinations("", root)
}