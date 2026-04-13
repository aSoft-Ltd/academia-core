package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind

fun DocumentBuilder.bullets(content: artx.DocumentBuilder.() -> Unit) = container(
    kind = Kind.ul,
    current = content,
    children = {}
)