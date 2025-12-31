package academia.authentication


@Deprecated("Do not use this intrerface")
interface AuthenticationScheme {

    suspend fun signIn(account: String, password: String): Session

    suspend fun signIn(params: SignInParams): Session

    /**
     * Sign out the user on all devices they are currently logged in
     */
    suspend fun signOutGlobal(params: SignInParams): String

    /**
     * Removes the account from the server
     */
    suspend fun deleteAccount(params: SignInParams): SignInParams

    val password: PasswordScheme
}