package academia.schemes.authentication

interface PasswordScheme {
    suspend fun reset(account: String): String
    suspend fun change(params: Any): Any
}