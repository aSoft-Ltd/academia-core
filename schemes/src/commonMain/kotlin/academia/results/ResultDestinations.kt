package academia.results

class ResultDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun routes() = "$root/*"
    fun result(uid: String) = ResultSheetDestinations(this.prefix, uid)
    fun isolated() = ResultDestinations("", root)
}