package academia.website

class AcademicsDestinations(val base: String) {
    private val root by lazy { "academics" }
    private val prefix by lazy { if (base.isEmpty()) "" else "$base/$root" }
    fun home() = prefix
    fun nursery() = "$prefix/nursery"
    fun primary() = "$prefix/primary"
    fun oLevel() = "$prefix/oLevel"
    fun aLevel() = "$prefix/aLevel"
    fun extraCurriculum() = "$prefix/extraCurriculum"
}