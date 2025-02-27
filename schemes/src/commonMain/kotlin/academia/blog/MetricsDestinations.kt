package academia.blog

class MetricsDestinations(prefix: String, private val base: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$base" }
        fun index() = "$prefix/"
        fun live() = "$prefix/insert"
        fun visitors() = "$prefix/visitors"
        fun readers() = "$prefix/view"
        fun routes() = "$base/*"
        fun isolated() = MetricsDestinations("", base)
    }