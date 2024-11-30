package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.BulletedParagraph
import academia.legal.tools.paragraph.EmphasizedParagraph

internal fun whenAndWithWhomDoWeShareYourPersonalInformation()  = LegalSection(
    title = "WHEN AND WITH WHOM DO WE SHARE YOUR PERSONAL INFORMATION?",
    paragraphs = listOf(
        BulletedParagraph(
            pretext = "In Short: We may share your information in specific situations outlined in this section or with the following third parties",
            bullets = listOf(
                EmphasizedParagraph(
                    emphasis = "Business Transfers:",
                    continuation = """
                        Your personal information may be shared or transferred during negotiations or in connection with mergers, 
                        sales of company assets, financing, or acquisitions of part or all of our business by another company.
                    """.trimIndent()
                ),
                EmphasizedParagraph(
                    emphasis = "Business Partners:",
                    continuation = "We may share your information with our business partners to provide you with specific products, services, or promotions."
                ),
                EmphasizedParagraph(
                    emphasis = "Other Users:",
                    continuation = """
                        If you post comments, contributions, or other content in public areas of the Services, 
                        that information may be visible to other users and potentially accessible outside the platform indefinitely. 
                        Additionally, other users may be able to see your activity, communicate with you within the platform, and view your profile details.
                    """.trimIndent()
                )
            )
        )
    )
)