package academia.results

class ReportDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun report(uid: String) = ReportSheetDestinations(this.prefix, uid)
    fun isolated() = ReportDestinations("", root)
}