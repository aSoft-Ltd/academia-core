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
    in listOf(_root_ide_package_.artx.elements.Kind.text, _root_ide_package_.artx.elements.Kind.h1, _root_ide_package_.artx.elements.Kind.h2, _root_ide_package_.artx.elements.Kind.h3, _root_ide_package_.artx.elements.Kind.h4, _root_ide_package_.artx.elements.Kind.h5, _root_ide_package_.artx.elements.Kind.h6) -> toText()
    _root_ide_package_.artx.elements.Kind.link -> toLink()
    _root_ide_package_.artx.elements.Kind.document -> toDocument()
    in listOf(_root_ide_package_.artx.elements.Kind.callout, _root_ide_package_.artx.elements.Kind.paragraph) -> toFertileElement()
    else -> _root_ide_package_.artx.renderer.json.UnknownElement(kind, depth)
}

private val JsonObject.kind get() = getValue(artx.elements.Element::kind.name).jsonPrimitive.content
private val JsonObject.depth get() = getValue(artx.elements.Element::depth.name).jsonPrimitive.int
private fun JsonObject.string(key: KProperty<*>) = getValue(key.name).jsonPrimitive.content

private fun JsonObject.toText() = _root_ide_package_.artx.elements.Text(
    kind = kind,
    depth = depth,
    content = string(_root_ide_package_.artx.elements.Text::content)
)

private fun JsonObject.toLink() = _root_ide_package_.artx.elements.Link(
    to = string(_root_ide_package_.artx.elements.Link::to),
    text = string(_root_ide_package_.artx.elements.Link::text),
    depth = depth,
    styles = null
)

private val JsonObject.children get() = getValue(artx.elements.FertileElement::children.name).jsonArray

private val JsonObject.childrenAsElements get() = children.map { it.jsonObject.toElement() }

fun JsonObject.toDocument() = _root_ide_package_.artx.Document(
    children = childrenAsElements
)

private fun JsonObject.toFertileElement() = _root_ide_package_.artx.elements.internal.FertileComponentImpl(
    kind = kind,
    depth = depth,
    children = childrenAsElements
)