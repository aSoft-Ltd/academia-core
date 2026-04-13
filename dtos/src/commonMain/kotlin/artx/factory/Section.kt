package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.factory.heading

fun DocumentBuilder.section(title: String, content: DocumentBuilder.() -> Unit) = container(
    kind = Kind.section,
    current = { heading(title) },
    children = content
)