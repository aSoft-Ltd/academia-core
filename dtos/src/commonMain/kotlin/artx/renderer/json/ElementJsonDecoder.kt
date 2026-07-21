package artx.renderer.json

import artx.Document
import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.Kind
import artx.elements.Link
import artx.elements.Text
import artx.elements.internal.FertileComponentImpl
import artx.renderer.json.children
import artx.renderer.json.childrenAsElements
import artx.renderer.json.depth
import artx.renderer.json.kind
import artx.renderer.json.string
import artx.renderer.json.toDocument
import artx.renderer.json.toElement
import artx.renderer.json.toFertileElement
import artx.renderer.json.toLink
import artx.renderer.json.toText
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlin.reflect.KProperty

private fun JsonObject.toElement(): artx.elements.Element = when (kind) {
    in listOf(artx.elements.Kind.text, artx.elements.Kind.h1, artx.elements.Kind.h2, artx.elements.Kind.h3, artx.elements.Kind.h4, artx.elements.Kind.h5, artx.elements.Kind.h6) -> toText()
    artx.elements.Kind.link -> toLink()
    artx.elements.Kind.document -> toDocument()
    in listOf(artx.elements.Kind.callout, artx.elements.Kind.paragraph) -> toFertileElement()
    else -> artx.renderer.json.UnknownElement(kind, depth)
}

private val JsonObject.kind get() = getValue(artx.elements.Element::kind.name).jsonPrimitive.content
private val JsonObject.depth get() = getValue(artx.elements.Element::depth.name).jsonPrimitive.int
private fun JsonObject.string(key: KProperty<*>) = getValue(key.name).jsonPrimitive.content

private fun JsonObject.toText() = artx.elements.Text(
    kind = kind,
    depth = depth,
    content = string(artx.elements.Text::content)
)

private fun JsonObject.toLink() = artx.elements.Link(
    to = string(artx.elements.Link::to),
    text = string(artx.elements.Link::text),
    depth = depth,
    styles = null
)

private val JsonObject.children get() = getValue(artx.elements.FertileElement::children.name).jsonArray

private val JsonObject.childrenAsElements get() = children.map { it.jsonObject.toElement() }

fun JsonObject.toDocument() = artx.Document(
    children = childrenAsElements
)

private fun JsonObject.toFertileElement() = artx.elements.internal.FertileComponentImpl(
    kind = kind,
    depth = depth,
    children = childrenAsElements
)