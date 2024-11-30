package academia.legal.tools.paragraph

import kotlinx.serialization.Serializable

@Serializable
data class PlainParagraph(val content: String) : LegalParagraph