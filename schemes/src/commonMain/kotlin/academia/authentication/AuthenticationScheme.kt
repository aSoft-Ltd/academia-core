package academia.authentication

import koncurrent.Later

interface AuthenticationScheme {

    fun signIn(account: String, password: String): Later<Session>

    fun signIn(params: SignInParams): Later<Session>

    fun resetPassword(param: SignInParam): Later<Session>
}