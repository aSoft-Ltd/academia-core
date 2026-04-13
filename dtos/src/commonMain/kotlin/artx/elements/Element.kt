package artx.elements

@Deprecated("Use the other art")
sealed interface Element {
    val depth: Int
    val kind: String
}