package academia.classes

class ClassesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun dashboard() = prefix
    fun profile(uid: String) = if (prefix.isEmpty()) uid else "$prefix/$uid"
    fun routes() = "$root/*"
    fun isolated() = ClassesDestinations("", root)
}