package academia.blog

class BlogDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun dashboard() = "$prefix/dashboard"
    fun list() = "$prefix/all"
    fun edit() = "$prefix/edit"
    fun routes() = "$root/*"
    fun isolated() = BlogDestinations("", root)
}