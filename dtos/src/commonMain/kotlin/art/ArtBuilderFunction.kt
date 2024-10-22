package art

/**
    ART Document
    header:
    assets:
    chunks: [
        SectionChunk
    ]
 */
fun buildArt(block: DocumentBuilder.() -> Unit): Document {
    return DocumentBuilder().apply(block).build()
}