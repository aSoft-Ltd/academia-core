package academia.pricing

fun Package.amount(months: Month, students: Int): Int = (amount[months] ?: (Int.MAX_VALUE / students)) * students

fun List<Credit>.amount(feature: Feature, month: Month, students: Int): Int {
    val offering = firstOrNull { it.feature == feature } ?: return 0
    val unit = offering.amount[month] ?: return 0
    return unit * students
}