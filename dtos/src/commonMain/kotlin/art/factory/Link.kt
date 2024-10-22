package art.factory

import art.DocumentBuilder
import art.elements.Link
import art.elements.SterileElement
import art.styles.TextStyle

fun DocumentBuilder.link(to: String, text: String = to, style: TextStyle? = null): SterileElement {
    val element = Link(to, text, depth, style)
    elements.add(element)
    return element
}