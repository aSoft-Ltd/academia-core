package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun howDoWeKeepYourInformationSafe() = LegalSection(
    title = "HOW DO WE KEEP YOUR INFORMATION SAFE?",
    paragraphs = listOf(
        PlainParagraph("In Short: We strive to safeguard your personal information using a combination of organizational and technical security measures."),
        PlainParagraph(
            content = """
                We have put in place suitable and reasonable technical and organizational measures to protect the security of the personal information we handle. 
                However, despite our best efforts to secure your data, no electronic transmission over the internet or storage method can be guaranteed to be 100% secure. 
                Therefore, we cannot assure you that hackers, cybercriminals, or other unauthorized individuals will not breach our security and access, collect, steal, 
                or alter your information. While we are committed to protecting your personal information, you transmit it to and from our Services at your own risk. 
                We recommend that you access our Services only from a secure environment.
            """.trimIndent()
        )
    )
)