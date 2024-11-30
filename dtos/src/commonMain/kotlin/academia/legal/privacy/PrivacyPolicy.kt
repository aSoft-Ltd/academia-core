package academia.legal.privacy

import academia.legal.tools.paragraph.LegalParagraph
import kotlinx.serialization.Serializable

@Serializable
data class PrivacyPolicy(
    val updated: String,
    val intro: List<LegalParagraph>,
    val summary: List<LegalParagraph>,
    val sections: List<LegalSection>
)