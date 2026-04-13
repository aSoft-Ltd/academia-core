package artx.factory

import artx.DocumentBuilder
import artx.elements.Link
import artx.elements.SterileElement
import artx.styles.TextStyle

fun DocumentBuilder.link(to: String, text: String = to, style: TextStyle? = null): SterileElement {
    val element = Link(to, text, depth, style)
    elements.add(element)
    return element
}