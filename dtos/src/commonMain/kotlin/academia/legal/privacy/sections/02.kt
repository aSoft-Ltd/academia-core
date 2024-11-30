package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.BulletedParagraph
import academia.legal.tools.paragraph.EmphasizedParagraph
import academia.legal.tools.paragraph.PlainParagraph

internal fun howDoWeProcessYourInformation() = LegalSection(
    title = "HOW DO WE PROCESS YOUR INFORMATION?",
    paragraphs = listOf(
        PlainParagraph(
            content = """
                In Short: We process your information to provide, enhance, and manage our services, communicate with you, 
                ensure security and fraud prevention, and comply with legal requirements
            """.trimIndent()
        ),
        BulletedParagraph(
            pretext = """
                In some cases, we may also process your data with your consent for other purposes.
                The reasons we handle your personal information depend on your interaction with our services and may include:
            """.trimIndent(),
            bullets = listOf(
                EmphasizedParagraph(
                    emphasis = "Facilitating account creation and management:",
                    continuation = "We process your data to help you set up, log in, and maintain your account"
                ),
                EmphasizedParagraph(
                    emphasis = "Responding to inquiries and providing support:",
                    continuation = "Your information may be processed to address your inquiries and resolve any issues related to our services."
                ),
                EmphasizedParagraph(
                    emphasis = "Sending administrative updates:",
                    continuation = "We may use your information to notify you of updates to our products, services, terms, or policies."
                ),
                EmphasizedParagraph(
                    emphasis = "Fulfilling and managing orders:",
                    continuation = "We process your data to manage orders, payments, returns, and exchanges made through our platform."
                ),
                EmphasizedParagraph(
                    emphasis = "Enabling user-to-user communication:",
                    continuation = "If you use our services that allow interaction between users, we process your data to facilitate those communications."
                ),
                EmphasizedParagraph(
                    emphasis = "Requesting feedback:",
                    continuation = "We may use your information to request feedback and engage with you about your experience using our services."
                ),
                EmphasizedParagraph(
                    emphasis = "Sending marketing and promotional content:",
                    continuation = """
                        With your consent and according to your preferences, we may process your personal information for marketing purposes. 
                        You can opt out of receiving these communications at any time (see "WHAT ARE YOUR PRIVACY RIGHTS?")
                    """.trimIndent()
                ),
                EmphasizedParagraph(
                    emphasis = "Identifying usage patterns:",
                    continuation = "Your data may be used to help us understand how our services are being utilized so we can continue to enhance them."
                ),
                EmphasizedParagraph(
                    emphasis = "Improving our services and user experience:",
                    continuation = """
                        We may process your data to analyze usage trends, assess the success of our marketing campaigns, 
                        and improve our services, products, and your overall experience.
                    """.trimIndent()
                )
            )
        )
    )
)