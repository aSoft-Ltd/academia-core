package art.elements

import art.styles.TextStyle

class Link(
    val to: String,
    val text: String,
    override val depth: Int,
    val styles: TextStyle?,
) : SterileElement {
    override val kind: String = Kind.link
}