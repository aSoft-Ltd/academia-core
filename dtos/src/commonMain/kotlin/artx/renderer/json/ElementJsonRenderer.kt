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

fun artx.elements.Element.toJson() = when (this) {
    is artx.elements.FertileElement -> toJson()
    is artx.elements.SterileElement -> toJson()
}

private fun artx.elements.SterileElement.toJson(): JsonObject = when (this) {
    is artx.elements.Text -> toJson()
    is artx.elements.Link -> toJson()
    else -> buildJsonObject {
        put(artx.elements.Element::kind.name, _root_ide_package_.artx.elements.Element.kind)
        put(artx.elements.Element::depth.name, _root_ide_package_.artx.elements.Element.depth)
    }
}

private fun artx.elements.Link.toJson() = buildJsonObject {
    put(artx.elements.Link::kind.name, _root_ide_package_.artx.elements.Link.kind)
    put(_root_ide_package_.artx.elements.Link::to.name, to)
    put(_root_ide_package_.artx.elements.Link::text.name, text)
    put(_root_ide_package_.artx.elements.Link::depth.name, depth)
}

private fun artx.elements.Text.toJson() = buildJsonObject {
    put(_root_ide_package_.artx.elements.Text::kind.name, kind)
    put(_root_ide_package_.artx.elements.Text::content.name, content)
    put(_root_ide_package_.artx.elements.Text::depth.name, depth)
}

private fun artx.elements.FertileElement.toJson(): JsonObject = buildJsonObject {
    put(artx.elements.Element::kind.name, _root_ide_package_.artx.elements.Element.kind)
    put(artx.elements.Element::depth.name, _root_ide_package_.artx.elements.Element.depth)
    put(artx.elements.FertileElement::children.name, buildJsonArray {
        _root_ide_package_.artx.elements.FertileElement.children.map { add(it.toJson()) }
    })
}