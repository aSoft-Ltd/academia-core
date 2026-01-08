package academia.authentication

interface AuthenticationApi : AuthenticationScheme {
    /**
     * Sign out the user on this device alone
     */
    suspend fun signOutLocal(): Unit
}