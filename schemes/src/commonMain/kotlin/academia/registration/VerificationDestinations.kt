package academia.registration

class VerificationDestinations(private val base: String) {
    fun sendCode() = "$base/code/send"
    fun info(account: String) = "$base/info/$account"
    fun verify() = "$base/verify"
}