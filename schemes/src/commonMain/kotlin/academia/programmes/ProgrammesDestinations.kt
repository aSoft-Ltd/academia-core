package academia.programmes

class ProgrammesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun programmes() = "$prefix/programmes"
    val programme by lazy { ProgrammeDestinations(prefix, "programme") }
    fun routes() = "$root/*"
    fun isolated() = ProgrammesDestinations("", root)
}