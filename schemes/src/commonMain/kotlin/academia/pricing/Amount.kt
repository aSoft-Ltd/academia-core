package academia.pricing

fun Package.amount(months: Month, students: Int): Int = (amount[months] ?: (Int.MAX_VALUE / students)) * students