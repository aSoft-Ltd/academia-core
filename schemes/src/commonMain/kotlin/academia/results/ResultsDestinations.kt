package academia.results

class ResultsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun reports() = ReportDestinations(this.prefix,"reports")
    fun grades() = "$prefix/grades"
    fun results() = ResultDestinations(this.prefix,"sheets")
    fun isolated() = ResultsDestinations("", root)
}