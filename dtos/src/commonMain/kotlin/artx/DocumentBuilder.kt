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
        val curr = DocumentBuilder(depth).apply(current).elements
        val kids = DocumentBuilder(depth + 1).apply(children).elements
        val component = artx.elements.internal.FertileComponentImpl(kind, depth, curr + kids)
        elements.add(component)
        return component
    }

    internal fun build() = artx.Document(elements)
}