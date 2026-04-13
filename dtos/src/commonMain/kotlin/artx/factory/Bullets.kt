package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind

fun artx.DocumentBuilder.bullets(content: artx.DocumentBuilder.() -> Unit) = _root_ide_package_.artx.DocumentBuilder.container(
    kind = _root_ide_package_.artx.elements.Kind.ul,
    current = content,
    children = {}
)