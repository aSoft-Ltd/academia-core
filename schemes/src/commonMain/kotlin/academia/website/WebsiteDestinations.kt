package academia.website

class WebsiteDestinations(val base: String) {
    private val root by lazy { "website" }
    private val prefix by lazy { if (base.isEmpty()) "" else "$base/$root" }
    val home by lazy { HomeDestinations(prefix) }
    fun about() = "$prefix/about"
    val academics by lazy { AcademicsDestinations(prefix) }
    fun admissions() = "$prefix/admissions"
    fun news() = "$prefix/news"
    fun fees() = "$prefix/fees"
    fun contacts() = "$prefix/contacts"
    fun routes() = "$root/*"
    fun isolated() = WebsiteDestinations("")

    class AcademicsDestinations(private val base: String) {
        private val root = "academics"
        private val prefix by lazy { if (base.isEmpty()) "" else "$base/$root" }
        fun index() = "$prefix/"
        fun hero() = index()
        fun subjects() = "$prefix/subjects"
        fun nursery() = "$prefix/nursery"
        fun primary() = "$prefix/primary"
        fun oLevel() = "$prefix/oLevel"
        fun aLevel() = "$prefix/aLevel"
        fun extraCurriculum() = "$prefix/extraCurriculum"
        fun routes() = "$root/*"
        fun isolated() = AcademicsDestinations("")
    }

    class HomeDestinations(private val base: String) {
        private val root = "/"
        private val prefix by lazy { if (base.isEmpty()) "" else "$base/$root" }
        fun index() = prefix
        fun hero() = index()
        fun missionVision() = "$base/missionVision"
        fun gallery() = "$base/gallery"
        fun message() = "$base/message"
        fun news() = "$base/news"
        fun contact() = "$base/contact"
        fun routes() = "$root/*"
        fun isolated() = AcademicsDestinations("")
    }
}
