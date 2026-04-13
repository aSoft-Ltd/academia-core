package academia.authentication

import heimdal.authentication.LoginResult
import kotlinx.rpc.annotations.Rpc

@Rpc
interface Authentication {
    /**
     * Attempts to sign in a user with the provided account and password.
     */
    suspend fun login(account: String, password: String): LoginResult
    suspend fun logout(): String?
}