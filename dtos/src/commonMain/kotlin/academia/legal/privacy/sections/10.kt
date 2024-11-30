package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun howCanYouContactUsAboutThisNotice(inquiries: String) = LegalSection(
    title = "HOW CAN YOU CONTACT US ABOUT THIS NOTICE?",
    paragraphs = listOf(
        PlainParagraph("If you have any questions or feedback regarding this notice, please feel free to reach out to us at $inquiries")
    )
)