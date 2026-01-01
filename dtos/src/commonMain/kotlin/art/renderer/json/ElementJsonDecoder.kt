package art.renderer.json

import art.Document
import art.elements.Element
import art.elements.FertileElement
import art.elements.Kind
import art.elements.Link
import art.elements.Text
import art.elements.internal.FertileComponentImpl
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlin.reflect.KProperty

private fun JsonObject.toElement(): Element = when (kind) {
    in listOf(Kind.text, Kind.h1, Kind.h2, Kind.h3, Kind.h4, Kind.h5, Kind.h6) -> toText()
    Kind.link -> toLink()
    Kind.document -> toDocument()
    in listOf(Kind.callout, Kind.paragraph) -> toFertileElement()
    else -> UnknownElement(kind, depth)
}

private val JsonObject.kind get() = getValue(Element::kind.name).jsonPrimitive.content
private val JsonObject.depth get() = getValue(Element::depth.name).jsonPrimitive.int
private fun JsonObject.string(key: KProperty<*>) = getValue(key.name).jsonPrimitive.content

private fun JsonObject.toText() = Text(
    kind = kind,
    depth = depth,
    content = string(Text::content)
)

private fun JsonObject.toLink() = Link(
    to = string(Link::to),
    text = string(Link::text),
    depth = depth,
    styles = null
)

private val JsonObject.children get() = getValue(FertileElement::children.name).jsonArray

private val JsonObject.childrenAsElements get() = children.map { it.jsonObject.toElement() }

fun JsonObject.toDocument() = Document(
    children = childrenAsElements
)

private fun JsonObject.toFertileElement() = FertileComponentImpl(
    kind = kind,
    depth = depth,
    children = childrenAsElements
)