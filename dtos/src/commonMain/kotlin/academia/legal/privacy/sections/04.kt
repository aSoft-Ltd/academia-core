package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun whatIsOurStanceOnThirdPartyWebsites() = LegalSection(
    title = "WHAT IS OUR STANCE ON THIRD-PARTY WEBSITES?",
    paragraphs = listOf(
        PlainParagraph(
            content = """
                In Short: We are not responsible for the security of any information you share with third parties 
                that we link to or who advertise on our Services but are not associated with us.
            """.trimIndent()
        ),
        PlainParagraph(
            content = """
                Academia may contain links to third-party websites, online platforms, or mobile apps, 
                as well as advertisements from third parties that are not affiliated with us. 
                These links may lead to external websites, services, or apps, but we make no guarantees about them. 
                We are not liable for any loss or damage resulting from your use of these third-party platforms.
            """.trimIndent()
        ),
        PlainParagraph(
            content = """
                The presence of a link does not imply our endorsement, and we cannot ensure the safety or privacy of any data 
                you share with such third parties. Data collected by them is not covered by this Privacy Notice, 
                and we are not responsible for the content, privacy, or security practices of these external websites, services, or apps. 
                It is recommended that you review their policies and contact them directly if you have any concerns.
            """.trimIndent()
        )
    )
)