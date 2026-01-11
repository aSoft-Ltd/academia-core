package academia.registration

data class RegistrationParams(
    val school: SchoolParams,
    var person: PersonParams?,
    val curriculum: SchoolCurriculumParams
)