package artx

/**
    ART Document
    header:
    assets:
    chunks: [
        SectionChunk
    ]
 */
fun buildArt(block: artx.DocumentBuilder.() -> Unit): artx.Document {
    return _root_ide_package_.artx.DocumentBuilder().apply(block).build()
}