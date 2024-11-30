package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun howLongDoWeKeepYourInformation() = LegalSection(
    title = "HOW LONG DO WE KEEP YOUR INFORMATION?",
    paragraphs = listOf(
        PlainParagraph(
            content = """
                In Short: We retain your information only as long as necessary to achieve the purposes outlined in this Privacy Notice, 
                unless legally required to keep it longer
            """.trimIndent()
        ),
        PlainParagraph(
            content = """
                We will store your personal information for as long as needed to fulfill the purposes described in this Privacy Notice, 
                unless a longer retention period is mandated by law (for example, for tax or accounting reasons). 
                We will not retain your personal information beyond the time you maintain an account with us. 
                Once we no longer have a legitimate business reason to process your data, we will either delete or anonymize it. 
                If deletion is not feasible (such as when stored in backup systems), we will securely store and protect your data until it can be deleted.
            """.trimIndent()
        ),

    )
)