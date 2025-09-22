package academia.admission

class InterviewDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun sittings() = "$prefix/sittings"
    fun requirements() = "$prefix/requirements"
    fun subjects() = "$prefix/subjects"
    fun payments() = "$prefix/payments"
    fun routes() = "$prefix/*"
    val sitting by lazy { SittingDestinations(this.prefix, "sitting") }
    fun isolated() = InterviewDestinations("", root)
}