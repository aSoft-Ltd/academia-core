package academia.legal.privacy

import academia.legal.tools.paragraph.EmphasizedParagraph
import academia.legal.tools.paragraph.LegalParagraph
import kotlinx.serialization.Serializable

@Serializable
data class Intro(
    val opening: List<LegalParagraph>,
    val bullets: List<String>,
    val closing: EmphasizedParagraph
)