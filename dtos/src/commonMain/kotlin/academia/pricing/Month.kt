package academia.pricing

enum class Month {
    M01,
    M03,
    M06,
    M12,
    MXX;

    fun toLabel() = when (this) {
        M01 -> "1 Month"
        M03 -> "3 Months"
        M06 -> "6 Months"
        M12 -> "12 Months"
        MXX -> "Unlimited"
    }

    companion object {
        val default: Month = M03;
    }
}