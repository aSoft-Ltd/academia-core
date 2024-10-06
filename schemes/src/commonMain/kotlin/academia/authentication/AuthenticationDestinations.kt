package academia.authentication

class AuthenticationDestinations(private val base: String) {

    fun signIn() = "$base/sign/in"

    fun signIn(account: String, password: String) = signIn() + "?account=$account&password=$password"

    fun deleteAccount() = "$base/account/delete"

    val password by lazy { Password("$base/password") }

    class Password(private val base: String) {
        fun reset(account: String) = "$base/reset/$account"
        fun change() = "$base/change"
    }
}