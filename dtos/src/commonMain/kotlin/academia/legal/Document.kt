package academia.legal

import art.elements.Element
import kotlinx.serialization.Serializable

@Serializable
data class Document(
    val released: String,
    val prelude: String,
    val content: List<Element>
)