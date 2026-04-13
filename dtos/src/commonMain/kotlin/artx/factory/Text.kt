package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.elements.SterileElement
import artx.elements.Text
import artx.styles.TextStyle

fun artx.DocumentBuilder.text(value: String, style: artx.styles.TextStyle? = null): artx.elements.SterileElement {
    val element = _root_ide_package_.artx.elements.Text(_root_ide_package_.artx.elements.Kind.text, depth, value, style)
    _root_ide_package_.artx.DocumentBuilder.elements.add(element)
    return element
}

private fun clamp(min: Int, pref: Int, max: Int) = when {
    pref < min -> min
    pref > max -> max
    else -> pref
}

fun artx.DocumentBuilder.heading(value: String, style: artx.styles.TextStyle? = null): artx.elements.SterileElement {
    val level = _root_ide_package_.artx.factory.clamp(1, depth, 6)
    val kind = "@std/h$level"
    val element = _root_ide_package_.artx.elements.Text(kind, depth, value, style)
    _root_ide_package_.artx.DocumentBuilder.elements.add(element)
    return element
}

fun artx.DocumentBuilder.paragraph(content: artx.DocumentBuilder.() -> Unit) = _root_ide_package_.artx.DocumentBuilder.container(
    kind = _root_ide_package_.artx.elements.Kind.paragraph,
    current = content,
    children = {}
)