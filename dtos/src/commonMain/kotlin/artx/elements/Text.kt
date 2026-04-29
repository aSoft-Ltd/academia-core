package artx.elements

import artx.styles.TextStyle

class Text(
    override val kind: String,
    override val depth: Int,
    val content: String,
    val styles: artx.styles.TextStyle? = null,
) : artx.elements.SterileElement