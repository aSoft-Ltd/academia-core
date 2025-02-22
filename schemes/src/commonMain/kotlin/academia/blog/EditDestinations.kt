package academia.blog

class EditDestinations(prefix: String, private val base: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$base" }
    fun index() = "$prefix/"
    fun insert() = "$prefix/insert"
    fun metrics() = "$prefix/metrics"
    fun view() = "$prefix/view"
    fun routes() = "$base/*"
    fun isolated() = EditDestinations("", base)
}