package academia.registration

class VerificationDestinations(private val base: String) {
    fun sendCode() = "$base/code/send"
    fun verify(uid: String) = "$base/info/$uid"
    fun verify(uid: String, code: String) = verify(uid) + "?code=$code"
}