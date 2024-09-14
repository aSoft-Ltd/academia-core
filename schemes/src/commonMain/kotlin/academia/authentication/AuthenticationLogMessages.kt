package academia.authentication

class AuthenticationLogMessages {
    fun signIn(params: SignInParams) = "Signing ${params.account} in"

    fun deleteAccount(params: SignInParams) = "Deleting account ${params.account}"

    val password by lazy { Password() }

    class Password {
        fun reset(account: String) = "Resetting password for $account"
    }
}