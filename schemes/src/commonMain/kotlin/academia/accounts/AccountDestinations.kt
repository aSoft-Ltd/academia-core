package academia.accounts


class AccountDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun home() = prefix
    fun fees() = "$prefix/fees"
}