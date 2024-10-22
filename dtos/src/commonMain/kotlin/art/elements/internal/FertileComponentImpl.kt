package art.elements.internal

import art.elements.Element
import art.elements.FertileElement

internal class FertileComponentImpl(
    override val kind: String,
    override val depth: Int,
    override val children: List<Element>
) : FertileElement