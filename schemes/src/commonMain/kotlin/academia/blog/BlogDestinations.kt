package academia.blog

class BlogDestinations(private val base: String) {
    fun dashboard() = base
    fun list() = "$base/all"
    fun uid(value: String) = "$base/$value"
}