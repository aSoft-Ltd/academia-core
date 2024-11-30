package academia.legal.tools.paragraph

import kotlinx.serialization.Serializable

@Serializable
data class BulletedParagraph(
    val pretext: String,
    val bullets: List<LegalParagraph>
) : LegalParagraph