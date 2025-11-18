package academia.payments

class PaymentDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun dashboard() = "$prefix/dashboard"
    fun wallets() = "$prefix/wallets"
    fun invoices() = "$prefix/invoices"
    fun transactions() = "$prefix/transactions"
    fun routes() = "$root/*"
    fun isolated() = PaymentDestinations("", root)
}
