package academia.registration

class RegistrationDestinations(private val base: String) {

    fun begin() = "$base/begin"

    fun canRegister() = "$base/eligible"

    val verification by lazy { VerificationDestinations("$base/verification") }

    val info by lazy { Info("$base/info") }

    class Info(private val base: String) {
        fun school() = "$base/school"
        fun person() = "$base/person"
    }

    fun configure() = "$base/configure"

    fun abort(account: String) = "$base/abort/$account"

    fun finish(account: String) = "$base/finish/$account"
}