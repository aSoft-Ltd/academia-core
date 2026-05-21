package academia.pricing

fun Int?.formated(): String {
    if (this == null) return "0"
    if (this < 1000) return toString()
    val str = toString()
    val size = str.length
    val end = str.takeLast(3)
    val start = str.take(size - 3)
    return start.toInt().formated() + "," + end
}