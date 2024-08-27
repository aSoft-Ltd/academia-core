package academia.authentication

data class Session(
    val school: School,
    val user: User
) {
    data class School(
        val name: String,
        val domain: String,
    )

    data class User(
        val name: String,
        val email: String
    )
}