package academia.about

class AboutDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun social() = "$prefix/social"
    fun dependencies() = "$prefix/dependencies"
    fun terms() = "$prefix/terms"
    fun term(version: String) = "${terms()}/$version"
    fun routes() = "$root/*"
    fun isolated() = AboutDestinations("", root)
}