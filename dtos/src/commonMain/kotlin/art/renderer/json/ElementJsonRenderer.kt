package art.renderer.json

import art.elements.Element
import art.elements.FertileElement
import art.elements.Link
import art.elements.SterileElement
import art.elements.Text
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
        put(SterileElement::kind.name, kind)
        put(SterileElement::depth.name, depth)
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
    put(FertileElement::kind.name, kind)
    put(FertileElement::depth.name, depth)
    put(FertileElement::children.name, buildJsonArray {
        children.map { add(it.toJson()) }
    })
}