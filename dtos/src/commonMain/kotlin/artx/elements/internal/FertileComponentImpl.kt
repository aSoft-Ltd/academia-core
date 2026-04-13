package artx.elements.internal

import artx.elements.Element
import artx.elements.FertileElement

internal class FertileComponentImpl(
    override val kind: String,
    override val depth: Int,
    override val children: List<artx.elements.Element>
) : artx.elements.FertileElement