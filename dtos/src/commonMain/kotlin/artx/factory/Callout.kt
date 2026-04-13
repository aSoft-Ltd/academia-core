package artx.factory

import artx.DocumentBuilder
import artx.elements.Kind
import artx.factory.heading


fun DocumentBuilder.callout(title: String, content: DocumentBuilder.() -> Unit) = container(
    kind = Kind.callout,
    current = {
        heading(title)
        content()
    },
    children = {}
)