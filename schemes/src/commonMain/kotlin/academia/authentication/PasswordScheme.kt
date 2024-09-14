package academia.authentication

import koncurrent.Later

interface PasswordScheme {
    fun reset(account: String): Later<String>
    fun change(params: Any): Later<Any>
}