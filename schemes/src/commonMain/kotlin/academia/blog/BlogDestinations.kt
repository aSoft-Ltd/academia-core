package academia.blog

class BlogDestinations(private val base: String) {
    fun home() = base
    fun blog() = "$base/reviewer"
}