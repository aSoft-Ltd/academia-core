package artx.elements

import artx.styles.TextStyle

class Link(
    val to: String,
    val text: String,
    override val depth: Int,
    val styles: artx.styles.TextStyle?,
) : artx.elements.SterileElement {
    override val kind: String = _root_ide_package_.artx.elements.Kind.link
}