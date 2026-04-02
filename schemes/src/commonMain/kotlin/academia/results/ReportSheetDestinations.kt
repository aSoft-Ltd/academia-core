package academia.results

class ReportSheetDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun summary() = ReportSummaryDestinations(this.prefix, "summary")
    fun sitters() = ReportSitterDestinations(this.prefix, "sitters")
    fun results() = ReportResultDestinations(this.prefix, "results")
    fun routes() = "$root/*"
    fun isolated() = ReportSheetDestinations("", root)
}