package academia.registration

class RegistrationDestinations(private val base: String) {

    fun begin() = "$base/begin"

    val verification by lazy { VerificationDestinations("$base/verification") }

    val info by lazy { SchoolPersonSplit("$base/info") }

    val check by lazy { SchoolPersonSplit("$base/check") }

    class SchoolPersonSplit(private val base: String) {
        fun school() = "$base/school"
        fun person() = "$base/person"
    }

    fun structure() = "$base/structure"

    fun configure() = "$base/configure"

    fun abort(account: String) = "$base/abort/$account"

    fun finish(account: String) = "$base/finish/$account"
}
