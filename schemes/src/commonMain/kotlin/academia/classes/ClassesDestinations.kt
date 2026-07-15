package academia.classes

class ClassesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun moduleSetup() = prefix
    fun routes() = "$root/*"
    fun isolated() = ClassesDestinations("", root)
}