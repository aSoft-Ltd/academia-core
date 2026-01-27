package academia.payments

class PaymentDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val wallet by lazy { Wallet(this.prefix, "wallet") }
    fun dashboard() = "$prefix/dashboard"
    fun wallets() = "$prefix/wallets"
    fun invoices() = "$prefix/invoices"
    fun transactions() = "$prefix/transactions"
    fun routes() = "$root/*"
    fun isolated() = PaymentDestinations("", root)

    class Wallet(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        fun analytics() = "$prefix/analytics"
        fun accounts() = "$prefix/accounts"
        fun transactions() = "$prefix/transactions"
        fun routes() = "$root/*"
        fun isolated() = Wallet("", root)
    }
}
