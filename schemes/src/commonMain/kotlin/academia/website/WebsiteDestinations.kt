package academia.website

class WebsiteDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val home by lazy { Home(this.prefix, "home") }
    val academics by lazy { Academics(this.prefix, "academics") }
    fun about() = "$prefix/about"
    fun admissions() = "$prefix/admissions"
    fun news() = "$prefix/news"
    fun fees() = "$prefix/fees"
    fun contacts() = "$prefix/contacts"
    fun routes() = "$root/*"
    fun isolated() = WebsiteDestinations("", root)

    class Academics(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        private fun index() = "$prefix/"
        fun hero() = index()
        fun subjects() = "$prefix/subjects"
        fun nursery() = "$prefix/nursery"
        fun primary() = "$prefix/primary"
        fun secondary() = "$prefix/secondary"
        fun advance() = "$prefix/advance"
        fun activities() = "$prefix/activities"
        fun routes() = "$root/*"
        fun isolated() = Academics("", root)
    }

    class Home(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        private fun index() = "$prefix/"
        fun hero() = index()
        fun missionVision() = "$prefix/missionvision"
        fun gallery() = "$prefix/gallery"
        fun message() = "$prefix/message"
        fun news() = "$prefix/news"
        fun contact() = "$prefix/contact"
        fun routes() = "$root/*"
        fun isolated() = Home("", root)
    }
}