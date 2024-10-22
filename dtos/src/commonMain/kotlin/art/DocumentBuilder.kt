package art

import art.elements.Element
import art.elements.FertileElement
import art.elements.internal.FertileComponentImpl

class DocumentBuilder(internal val depth: Int = 0) {

    internal val elements = mutableListOf<Element>()

    internal fun container(
        kind: String,
        current: DocumentBuilder.() -> Unit,
        children: DocumentBuilder.() -> Unit
    ): FertileElement {
        val curr = DocumentBuilder(depth).apply(current).elements
        val kids = DocumentBuilder(depth + 1).apply(children).elements
        val component = FertileComponentImpl(kind, depth, curr + kids)
        elements.add(component)
        return component
    }

    internal fun build() = Document(elements)
}