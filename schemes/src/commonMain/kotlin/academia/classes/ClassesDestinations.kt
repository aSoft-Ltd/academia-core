package academia.classes

class ClassesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun detail(uid: String) = ClassDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ClassesDestinations("", root)

    class ClassDestinations(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
        fun index() = prefix
        fun students() = "$prefix/students"
        fun streams() = "$prefix/streams"
        fun stream(uid: String) = StreamDestinations(this.prefix, "streams/$uid")
        fun subjects() = "$prefix/subjects"
        fun teachers() = "$prefix/teachers"
        fun attendance() = "$prefix/attendance"
        fun routes() = "$root/*"
        fun isolated() = ClassDestinations("", root)

        class StreamDestinations(prefix: String, private val root: String) {
            private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
            fun index() = prefix
            fun students() = "$prefix/students"
            fun subjects() = "$prefix/subjects"
            fun teachers() = "$prefix/teachers"
            fun attendance() = "$prefix/attendance"
            fun fees() = "$prefix/fees"
            fun routes() = "$root/*"
            fun isolated() = StreamDestinations("", root)
        }
    }
}