package art.factory

import art.DocumentBuilder
import art.elements.Kind

fun DocumentBuilder.section(title: String, content: DocumentBuilder.() -> Unit) = container(
    kind = Kind.section,
    current = { heading(title) },
    children = content
)