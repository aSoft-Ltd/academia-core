package academia.profile

import academia.profile.school.CampusDestinations
import academia.profile.school.CampusesDestinations

class SchoolProfileDestination(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix

    //    fun campuses() = "$prefix/campuses"
    fun campus(uid: String) = CampusDestinations(prefix, "campuses/$uid")
    val campuses by lazy { CampusesDestinations(this.prefix, "campuses") }
    fun contacts() = "$prefix/contacts"
    fun preferences() = "$prefix/preferences"
    fun social() = "$prefix/social"
    fun security() = "$prefix/security"
    fun payments() = "$prefix/payments"
    fun address() = "$prefix/address"
    fun credits() = "$prefix/credits"
    fun domain() = "$prefix/domain"
    fun academics() = "$prefix/academics"
    fun fee() = "$prefix/fee"
    fun rules() = "$prefix/rules"
    fun legal() = "$prefix/legal"
    val campus by lazy { CampusDestinations(this.prefix, "campus") }
    fun routes() = "$root/*"
    fun isolated() = SchoolProfileDestination("", root)
}