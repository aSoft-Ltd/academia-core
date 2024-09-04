package academia.registration

import kotlinx.serialization.Serializable

@Serializable
class RegistrationInfo(
    val school: SchoolParams,
    val person: PersonParams
)