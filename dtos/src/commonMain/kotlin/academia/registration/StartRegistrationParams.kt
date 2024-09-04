package academia.registration

import kotlinx.serialization.Serializable

@Serializable
class StartRegistrationParams(
    val school: SchoolParams,
    val person: PersonParams
)