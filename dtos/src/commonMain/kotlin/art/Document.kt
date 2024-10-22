package art

import art.elements.Element
import art.elements.FertileElement
import art.elements.Kind

class Document(override val children: List<Element>) : FertileElement {
    override val depth: Int = 0
    override val kind = Kind.document
}