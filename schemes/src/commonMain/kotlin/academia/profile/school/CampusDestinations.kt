package academia.profile.school

class CampusDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index(campus: String) = "$prefix/$campus"
    fun curriculum() = "$prefix/curriculum"
    fun contacts() = "$prefix/contacts"
    fun social() = "$prefix/social"
    fun payments() = "$prefix/payments"
    fun credits() = "$prefix/credits"
    fun rules() = "$prefix/rules"
    val level by lazy { LevelDestinations(this.prefix,"level") }
    fun legal() = "$prefix/legal"
    fun routes() = "$root/*"
    fun isolated() = CampusDestinations("", root)
}