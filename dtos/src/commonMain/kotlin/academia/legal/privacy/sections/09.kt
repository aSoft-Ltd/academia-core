package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun doWeMakeUpdatesToThisNotice() = LegalSection(
    title = "DO WE MAKE UPDATES TO THIS NOTICE?",
    paragraphs = listOf(
        PlainParagraph("In Short: Yes, we will revise this notice as needed to ensure compliance with applicable laws."),
        PlainParagraph(
            content = """
                We may periodically update this Privacy Notice. Any updates will be reflected by a new "Revised" date at the top of the document. 
                If we make significant changes to the Privacy Notice, we may inform you by either prominently displaying a notice about the 
                changes or by sending you a direct notification. 
                We encourage you to regularly review this Privacy Notice to stay informed about how we are safeguarding your information.
            """.trimIndent()
        )
    )
)