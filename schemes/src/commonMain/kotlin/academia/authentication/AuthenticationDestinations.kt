package academia.authentication

class AuthenticationDestinations(private val base: String) {
    fun signIn() = "$base/sign/in"
}