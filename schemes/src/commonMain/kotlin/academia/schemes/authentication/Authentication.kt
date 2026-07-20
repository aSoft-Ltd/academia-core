package academia.schemes.authentication

import academia.authentication.SignInParams
import heimdal.authentication.LoginResult

//@Rpc
interface Authentication {
    /**
     * Attempts to sign in a user with the provided account and password.
     */
    suspend fun login(account: String, password: String): LoginResult = login(SignInParams(account, password))

    suspend fun login(params: SignInParams): LoginResult
    suspend fun logout(): String?
}