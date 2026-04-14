package artx

/**
    ART Document
    header:
    assets:
    chunks: [
        SectionChunk
    ]
 */
@Deprecated("use art")
fun buildArt(block: artx.DocumentBuilder.() -> Unit): artx.Document {
    return DocumentBuilder().apply(block).build()
}