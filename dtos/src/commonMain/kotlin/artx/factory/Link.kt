package artx.factory

import artx.DocumentBuilder
import artx.elements.Link
import artx.elements.SterileElement
import artx.styles.TextStyle

fun artx.DocumentBuilder.link(to: String, text: String = to, style: artx.styles.TextStyle? = null): artx.elements.SterileElement {
    val element = _root_ide_package_.artx.elements.Link(to, text, depth, style)
    _root_ide_package_.artx.DocumentBuilder.elements.add(element)
    return element
}