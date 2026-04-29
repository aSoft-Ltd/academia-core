package artx.renderer.json

import artx.elements.Element
import artx.elements.FertileElement
import artx.elements.Link
import artx.elements.SterileElement
import artx.elements.Text
import artx.renderer.json.toJson
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

fun Element.toJson() = when (this) {
    is FertileElement -> toJson()
    is SterileElement -> toJson()
}

private fun SterileElement.toJson(): JsonObject = when (this) {
    is Text -> toJson()
    is Link -> toJson()
    else -> buildJsonObject {
        put(Element::kind.name, kind)
        put(Element::depth.name, depth)
    }
}

private fun Link.toJson() = buildJsonObject {
    put(Link::kind.name, kind)
    put(Link::to.name, to)
    put(Link::text.name, text)
    put(Link::depth.name, depth)
}

private fun Text.toJson() = buildJsonObject {
    put(Text::kind.name, kind)
    put(Text::content.name, content)
    put(Text::depth.name, depth)
}

private fun FertileElement.toJson(): JsonObject = buildJsonObject {
    put(Element::kind.name, kind)
    put(Element::depth.name, depth)
    put(FertileElement::children.name, buildJsonArray {
        children.map { add(it.toJson()) }
    })
}