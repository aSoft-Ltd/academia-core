package artx

import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.internal.FertileComponentImpl

class DocumentBuilder(internal val depth: Int = 0) {

    internal val elements = mutableListOf<artx.elements.Element>()

    internal fun container(
        kind: String,
        current: artx.DocumentBuilder.() -> Unit,
        children: artx.DocumentBuilder.() -> Unit
    ): artx.elements.FertileElement {
        val curr = _root_ide_package_.artx.DocumentBuilder(depth).apply(current).elements
        val kids = _root_ide_package_.artx.DocumentBuilder(depth + 1).apply(children).elements
        val component = _root_ide_package_.artx.elements.internal.FertileComponentImpl(kind, depth, curr + kids)
        elements.add(component)
        return component
    }

    internal fun build() = _root_ide_package_.artx.Document(elements)
}