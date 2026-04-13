package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.factory.heading

fun artx.DocumentBuilder.section(title: String, content: artx.DocumentBuilder.() -> Unit) = _root_ide_package_.artx.DocumentBuilder.container(
    kind = _root_ide_package_.artx.elements.Kind.section,
    current = { heading(title) },
    children = content
)