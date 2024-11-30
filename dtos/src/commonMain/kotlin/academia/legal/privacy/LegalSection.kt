package academia.legal.privacy

import academia.legal.tools.paragraph.LegalParagraph
import kotlinx.serialization.Serializable

@Serializable
data class LegalSection(
    val title: String,
    val paragraphs: List<LegalParagraph> = emptyList(),
    val sections: List<LegalSection> = emptyList()
)