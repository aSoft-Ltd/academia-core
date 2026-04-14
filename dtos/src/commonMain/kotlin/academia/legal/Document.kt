package academia.legal

import art.Element
import kotlinx.serialization.Serializable

@Serializable
data class Document(
    val released: String,
    val prelude: List<Element>,
    val summary: List<Element>,
    val content: List<Element>
)