package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun howCanYouReviewUpdateOrDeleteTheDataWeCollectFromYou(domain: String) = LegalSection(
    title = "HOW CAN YOU REVIEW, UPDATE, OR DELETE THE DATA WE COLLECT FROM YOU?",
    paragraphs = listOf(
        PlainParagraph(
            content = """
                You have the right to request access to the personal information we have collected from you, 
                receive information on how we have processed it, correct any inaccuracies, or delete your personal information. 
                Additionally, you may have the right to withdraw your consent for us to process your personal information. 
                Please note that these rights may be subject to limitations under applicable law.
            """.trimIndent()
        ),
        PlainParagraph(
            content = "To request to review, update, or deletion of your personal information, please visit: $domain"
        )
    )
)