package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.elements.SterileElement
import artx.elements.Text
import artx.styles.TextStyle

fun DocumentBuilder.text(value: String, style: TextStyle? = null): SterileElement {
    val element =Text(Kind.text, depth, value, style)
    elements.add(element)
    return element
}

private fun clamp(min: Int, pref: Int, max: Int) = when {
    pref < min -> min
    pref > max -> max
    else -> pref
}

fun DocumentBuilder.heading(value: String, style: TextStyle? = null): SterileElement {
    val level = clamp(1, depth, 6)
    val kind = "@std/h$level"
    val element = Text(kind, depth, value, style)
    elements.add(element)
    return element
}

fun DocumentBuilder.paragraph(content: artx.DocumentBuilder.() -> Unit) = container(
    kind = Kind.paragraph,
    current = content,
    children = {}
)