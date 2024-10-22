package art.elements

sealed interface Element {
    val depth: Int
    val kind: String
}