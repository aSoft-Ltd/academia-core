package academia.website

class WebsiteDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun dashboard() = "$prefix/dashboard"
    fun pages() = "$prefix/pages"
    fun page() = "$prefix/page"
    fun routes() = "$root/*"
    fun isolated() = WebsiteDestinations("", root)
}