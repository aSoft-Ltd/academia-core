package academia.results

class ResultSheetDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun summary() = ResultSummaryDestinations(this.prefix, "summary")
    fun sitters() = ResultSitterDestinations(this.prefix, "sitters")
    fun routes() = "$root/*"
    fun isolated() = ResultSheetDestinations("", root)
}