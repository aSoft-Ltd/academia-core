package academia.about

class AboutDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun social() = "$prefix/social"
    fun dependencies() = "$prefix/dependencies"
    fun terms() = "$prefix/terms"
    fun term(version: String) = "${terms()}/$version"
    fun privacy() = "$prefix/privacy"
    fun privacy(version: String) = "${privacy()}/$version"
    fun refund() = "$prefix/refund"
    fun refund(version: String) = "${refund()}/$version"
    fun license() = "$prefix/license"
    fun license(version: String) = "${license()}/$version"
    fun serviceLevel() = "$prefix/service-level"
    fun serviceLevel(version: String) = "${serviceLevel()}/$version"
    fun routes() = "$root/*"
    fun isolated() = AboutDestinations("", root)
}