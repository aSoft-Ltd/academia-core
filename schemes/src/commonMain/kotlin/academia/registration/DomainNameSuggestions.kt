package academia.registration

/**
 * Proposes a set of domain name suggestions based on the provided name.
 */
fun proposeDomain(school: String?): Set<String> = buildSet {
    if(school.isNullOrBlank()) return@buildSet

    val splits = school.split(" ")
    if (splits.size == 1) add(school.lowercase())
    add(splits.first().lowercase())
    add(splits.mapNotNull { it.firstOrNull()?.lowercase() }.joinToString(separator = "") { it.first().lowercase() })
    add(splits.joinToString(separator = "") { it.lowercase() })
    if (splits.size >= 2) {
        add((splits[0].first() + splits[1]).lowercase())
        add((splits[0] + splits[1]).lowercase())
    }
}