package academia.website

class WebsiteDestinations(private val base: String) {
    fun home() = base
    fun about() = "$base/about"
    fun academic() = "$base/academic"
    fun admission() = "$base/admission"
    fun news() = "$base/news"
    fun fees() = "$base/fees"
    fun contact() = "$base/contact"
}
