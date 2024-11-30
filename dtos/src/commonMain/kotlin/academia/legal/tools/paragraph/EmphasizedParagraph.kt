package academia.legal.tools.paragraph

import kotlinx.serialization.Serializable

@Serializable
data class EmphasizedParagraph(
    val emphasis: String,
    val continuation: String
) : LegalParagraph