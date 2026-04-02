package academia.results

class ResultDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun reports() = ReportsDestinations(this.prefix, "reports")
    fun grades() = "$prefix/grades"
    fun results() = "$prefix/list"
    fun result(uid: String) = ResultSheetDestinations(this.prefix, uid)
    fun isolated() = ResultDestinations("", root)
}