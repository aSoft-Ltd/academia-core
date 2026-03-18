package academia.results

class ResultDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun reports() = "$prefix/reports"
    fun results() = "$prefix/list"
    fun isolated() = ResultDestinations("", root)
}