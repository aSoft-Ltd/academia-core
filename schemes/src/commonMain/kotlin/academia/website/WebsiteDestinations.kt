package academia.website

class WebsiteDestinations(val base: String) {
    private val root by lazy { "website" }
    private val prefix by lazy { if (base.isEmpty()) "" else "$base/$root" }
    fun home() = "$prefix/"
    fun about() = "$prefix/about"
    fun academics() = "$prefix/academics"
    fun admissions() = "$prefix/admissions"
    fun news() = "$prefix/news"
    fun fees() = "$prefix/fees"
    fun contacts() = "$prefix/contacts"
    fun routes() = "$root/*"
    fun isolated() = WebsiteDestinations("")
}
