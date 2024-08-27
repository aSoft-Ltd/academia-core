package academia.registration

data class PersonParams(
    val name: String,
    val account: String,
    val gender: Gender
) {
    enum class Gender {
        male,female
    }
}