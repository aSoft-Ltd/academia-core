package academia.payments

class PaymentDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    val wallet by lazy { Wallet(this.prefix, "wallet") }
    val transaction by lazy { Transaction(this.prefix, "transaction") }
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

    class Transaction(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
        fun info() = "$prefix/info"
        fun routes() = "$root/*"
        fun isolated() = Transaction("", root)
    }
}
