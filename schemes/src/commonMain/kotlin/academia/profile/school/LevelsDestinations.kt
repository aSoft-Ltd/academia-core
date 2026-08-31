package academia.profile.school

class LevelsDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun uid(
        uid: String,
        levelType: String = "SUBJECT_BASED",
        subjectStructure: String = "COMBINATION",
        isOnboarding: Boolean = false,
    ) = LevelDestinations(prefix = this.prefix, root = "$uid?levelType=$levelType&subjectStructure=$subjectStructure&isOnboarding=$isOnboarding")

    fun list() = prefix
    fun routes() = "$root/*"
    fun isolated() = LevelsDestinations("", root)
}