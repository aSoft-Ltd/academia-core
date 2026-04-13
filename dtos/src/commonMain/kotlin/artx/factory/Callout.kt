package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.factory.heading


fun artx.DocumentBuilder.callout(title: String, content: artx.DocumentBuilder.() -> Unit) = _root_ide_package_.artx.DocumentBuilder.container(
    kind = _root_ide_package_.artx.elements.Kind.callout,
    current = {
        heading(title)
        content()
    },
    children = {}
)