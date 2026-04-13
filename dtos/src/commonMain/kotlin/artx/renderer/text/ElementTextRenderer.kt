package artx.renderer.text

import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.Link
import artx.elements.SterileElement
import artx.elements.Text
import artx.renderer.text.toText

fun Element.toText(tab: String = " ") = when (this) {
    is FertileElement -> toText(tab)
    is SterileElement -> toText()
}

private fun SterileElement.toText(): String = when (this) {
    is Text -> toText()
    is Link -> toText()
    else -> "Unsupported"
}

private fun Link.toText(): String = if (to == text) to else "$text ($to)"

private fun Text.toText(): String = buildString {
    append(content)
    if (kind in (1..6).map { "@std/h$it" }) appendLine()
}

private fun FertileElement.toText(tab: String = " "): String = buildString {
    appendLine()
    appendLine()
    append(tab.repeat(depth))
    children.forEach { append(it.toText(tab)) }
}