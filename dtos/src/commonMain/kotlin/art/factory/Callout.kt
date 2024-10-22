package art.factory

import art.DocumentBuilder
import art.elements.Kind


fun DocumentBuilder.callout(title: String, content: DocumentBuilder.() -> Unit) = container(
    kind = Kind.callout,
    current = {
        heading(title)
        content()
    },
    children = {}
)