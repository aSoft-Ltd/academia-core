package artx

import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.Kind

class Document(override val children: List<artx.elements.Element>) : artx.elements.FertileElement {
    override val depth: Int = 0
    override val kind = _root_ide_package_.artx.elements.Kind.document
}