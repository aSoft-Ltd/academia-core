package academia.admission.bulk

class AdvertDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = "$prefix/adverts"
    fun routes() = "$prefix/*"
    fun isolated() = AdvertDestinations("", root)
}