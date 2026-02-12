package academia.profile

class CampusDestinations(prefix: String, private val root: String){
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun curriculum() = "$prefix/curriculum"
    fun contacts() = "$prefix/contacts"
    fun social() = "$prefix/social"
    fun payments() = "$prefix/payments"
    fun credits() = "$prefix/credits"
    fun rules() = "$prefix/rules"
    fun legal() = "$prefix/legal"
    fun routes() = "$root/*"
    fun isolated() = CampusDestinations("", root)
}