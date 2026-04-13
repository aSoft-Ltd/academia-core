package artx.renderer.text

import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.Link
import artx.elements.SterileElement
import artx.elements.Text
import artx.renderer.text.toText

fun artx.elements.Element.toText(tab: String = " ") = when (this) {
    is artx.elements.FertileElement -> toText(tab)
    is artx.elements.SterileElement -> toText()
}

private fun artx.elements.SterileElement.toText(): String = when (this) {
    is artx.elements.Text -> toText()
    is artx.elements.Link -> toText()
    else -> "Unsupported"
}

private fun artx.elements.Link.toText(): String = if (to == text) to else "$text ($to)"

private fun artx.elements.Text.toText(): String = buildString {
    append(content)
    if (kind in (1..6).map { "@std/h$it" }) appendLine()
}

private fun artx.elements.FertileElement.toText(tab: String = " "): String = buildString {
    appendLine()
    appendLine()
    append(tab.repeat(_root_ide_package_.artx.elements.Element.depth))
    _root_ide_package_.artx.elements.FertileElement.children.forEach { append(it.toText(tab)) }
}