package academia.registration

class RegistrationDestinations(
    private val base: String
) {
    fun begin() = "$base/begin"

    fun sendVerificationCode() = "$base/verification/code/send"

    fun verify() = "$base/verification/code/verify"

    fun configure() = "$base/configure"

    fun abort(account: String) = "$base/abort/$account"

    fun finish(account: String) = "$base/finish/$account"
}