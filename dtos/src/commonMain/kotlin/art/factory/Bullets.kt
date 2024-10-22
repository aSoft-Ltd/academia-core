package art.factory

import art.DocumentBuilder
import art.elements.Kind

fun DocumentBuilder.bullets(content: DocumentBuilder.() -> Unit) = container(
    kind = Kind.ul,
    current = content,
    children = {}
)