package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun whatAreYourPrivacyRights() = LegalSection(
    title = "WHAT ARE YOUR PRIVACY RIGHTS?",
    paragraphs = listOf(
        PlainParagraph(
            "In Short: You have the ability to review, modify, or delete your account at any time, depending on your country, province, or state of residence."
        )
    ),
    sections = listOf(
        LegalSection(
            title = "Withdrawing your consent:",
            paragraphs = listOf(
                PlainParagraph(
                    content = """
                        If we are processing your personal information based on your consent, whether explicit or implied under applicable law, 
                        you have the right to withdraw that consent at any time. To do so, you can contact us using the details provided in the section titled 
                        "HOW CAN YOU CONTACT US ABOUT THIS NOTICE?" below. Please keep in mind that withdrawing your consent will not affect the legality of any processing 
                        carried out prior to the withdrawal, nor will it impact any processing conducted under other lawful grounds permitted by applicable law.
                    """.trimIndent()
                )
            )
        ),
        LegalSection(
            title = "Opting out of marketing and promotional communications:",
            paragraphs = listOf(
                PlainParagraph(
                    content = """
                        You can opt out of our marketing and promotional messages at any time by clicking the unsubscribe link in our emails, 
                        disabling specific notifications from your account settings, or by reaching out to us using the contact information in the section 
                        "HOW CAN YOU CONTACT US ABOUT THIS NOTICE?" below. Once you opt out, you will be removed from our marketing lists. 
                        However, we may still reach out to you for service-related communications essential for managing and using your account, 
                        responding to service requests, or for other non-marketing reasons.
                    """.trimIndent()
                )
            )
        ),
        LegalSection(
            title = "Account Information:",
            paragraphs = listOf(
                PlainParagraph(
                    content = """
                        If you wish to review or update your account information or terminate your account, you can Log in to your account settings 
                        and modify your user information. Upon receiving your request to close your account, 
                        we will deactivate or delete your account and related information from our active databases. 
                        However, we may retain some data in our records to prevent fraud, troubleshoot issues, 
                        assist with investigations, enforce our legal agreements, and comply with applicable legal obligations.
                    """.trimIndent()
                )
            )
        )
    )
)