package academia.authentication

import koncurrent.Later

interface AuthenticationScheme {

    fun signIn(account: String, password: String): Later<Session>

    fun signIn(params: SignInParams): Later<Session>

    /**
     * Sign out the user on all devices they are currently logged in
     */
    fun signOutGlobal(params: SignInParams): Later<String>

    /**
     * Removes the account from the server
     */
    fun deleteAccount(params: SignInParams): Later<SignInParams>

    val password: PasswordScheme
}