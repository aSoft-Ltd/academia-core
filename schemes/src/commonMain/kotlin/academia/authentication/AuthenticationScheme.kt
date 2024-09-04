package academia.authentication

import koncurrent.Later

interface AuthenticationScheme {
    fun signIn(account: String, password: String): Later<Session>
}