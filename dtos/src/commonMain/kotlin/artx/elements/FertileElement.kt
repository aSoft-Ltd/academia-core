package artx.elements

interface FertileElement : artx.elements.Element {
    val children: List<artx.elements.Element>
}