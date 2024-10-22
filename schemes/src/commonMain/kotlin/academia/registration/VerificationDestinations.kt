package academia.registration

class VerificationDestinations(private val base: String) {
    fun sendCode() = "$base/code/send"
    fun sendCode(account: String) = sendCode() + "?account=$account"
    fun info(account: String) = "$base/info/$account"
    fun verify() = "$base/verify"
    fun verify(code: String) = verify() + "?code=$code"
}