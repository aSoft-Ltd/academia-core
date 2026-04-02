package academia.results

class ReportDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun summary() = "$prefix/summary"
    fun sitters() = "$prefix/sitters"
    fun results() = "$prefix/results"
    fun isolated() = ReportDestinations("", root)
}