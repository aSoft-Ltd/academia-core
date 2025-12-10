package academia

import heimdal.authentication.LoginResult
import kotlinx.rpc.annotations.Rpc

@Rpc
interface Auth {
    /**
     * Attempts to sign in a user with the provided account and password.
     */
    suspend fun login(account: String, password: String): LoginResult
    suspend fun signOut(account: String): String?
}