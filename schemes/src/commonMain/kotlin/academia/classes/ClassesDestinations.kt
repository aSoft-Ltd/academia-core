package academia.classes

class ClassesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun `class`(uid: String) = ClassDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ClassesDestinations("", root)

    class ClassDestinations(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
        fun index() = prefix
        fun students() = "$prefix/students"
        fun streams() = "$prefix/streams"
        fun subjects() = "$prefix/subjects"
        fun teachers() = "$prefix/teachers"
        fun attendance() = "$prefix/attendance"
        fun routes() = "$root/*"
        fun isolated() = ClassDestinations("", root)
    }
}