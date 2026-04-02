package academia.results

class ReportsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun report(uid: String) = ReportDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ReportsDestinations("", root)
}