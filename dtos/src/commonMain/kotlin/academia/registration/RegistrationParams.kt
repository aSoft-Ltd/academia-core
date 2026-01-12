package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class RegistrationParams(
    val school: SchoolParams,
    var person: PersonParams?,
    val curriculum: SchoolCurriculumParams
)