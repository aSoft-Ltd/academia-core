package academia.account

class AccountDestinations(private val base: String) {
    val personal by lazy { AccountMicroDestinations("$base/personal") }

    val school by lazy { AccountMicroDestinations("$base/school") }

    class AccountMicroDestinations(private val base: String) {
        fun menu() = "$base/menu"
        fun view() = "$base/view"
        fun form() = "$base/form"
    }
}