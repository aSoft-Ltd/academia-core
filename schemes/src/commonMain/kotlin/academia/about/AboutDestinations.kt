package academia.about

class AboutDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun social() = "$prefix/social"
    fun routes() = "$root/*"
    fun isolated() = AboutDestinations("", root)
}