package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class VerificationResult(
    val account: String
)