package art.elements

import art.styles.TextStyle

class Text(
    override val kind: String,
    override val depth: Int,
    val content: String,
    val styles: TextStyle? = null,
) : SterileElement