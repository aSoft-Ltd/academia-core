package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.BulletedParagraph
import academia.legal.tools.paragraph.EmphasizedParagraph
import academia.legal.tools.paragraph.PlainParagraph

internal fun whatInformationDoWeCollect() = LegalSection(
    title = "WHAT INFORMATION DO WE COLLECT?",
    sections = listOf(
        LegalSection(
            title = "Personal Information You Provide to Us",
            paragraphs = listOf(
                PlainParagraph("In Short: We collect personal information that you voluntarily share with us."),
                PlainParagraph(
                    content = """
                        We gather the personal information you choose to provide when you register for our Services, 
                        express interest in our products or services, participate in activities on the platform, or contact us in other ways.
                    """.trimIndent()
                )
            ),
        ),
        LegalSection(
            title = "Personal Information Provided by You",
            paragraphs = listOf(
                BulletedParagraph(
                    pretext = """
                        The specific information we collect depends on how you interact with us, your choices, 
                        and the features or products you use. This may include:
                    """.trimIndent(),
                    bullets = listOf(
                        PlainParagraph("Phone numbers"),
                        PlainParagraph("Email addresses"),
                        PlainParagraph("Names"),
                        PlainParagraph("Mailing addresses"),
                        PlainParagraph("Job titles"),
                        PlainParagraph("Usernames"),
                        PlainParagraph("Passwords"),
                        PlainParagraph("Contact preferences"),
                        PlainParagraph("Contact or authentication data"),
                        PlainParagraph("Billing addresses"),
                        PlainParagraph("Debit/credit card numbers"),
                        PlainParagraph("Academic information"),
                    )
                )
            )
        ),
        LegalSection(
            title = "Sensitive Information",
            paragraphs = listOf(
                BulletedParagraph(
                    pretext = "When necessary, and with your consent or as permitted by law, we may process sensitive data, including:",
                    bullets = listOf(
                        PlainParagraph("Health data"),
                        PlainParagraph("Financial data"),
                        PlainParagraph("Data about sexual orientation or sex life"),
                        PlainParagraph("Religious or philosophical beliefs"),
                        PlainParagraph("Student data"),
                    )
                )
            )
        ),
        LegalSection(
            title = "Payment Data",
            paragraphs = listOf(
                PlainParagraph(
                    content = """
                        If you pay for our services, we may collect necessary payment details, such as your payment reference number. 
                        All payment data is managed by your chosen payment vendor, and we advise you to review their Privacy Policy before completing any payment
                    """.trimIndent()
                )
            )
        ),
        LegalSection(
            title = "Application Data",
            paragraphs = listOf(
                BulletedParagraph(
                    pretext = "When you use our platform, we may collect the following information if you provide permission:",
                    bullets = listOf(
                        EmphasizedParagraph(
                            emphasis = "Mobile Device Data:",
                            continuation = "This includes your devices ID, model, manufacturer, operating system, browser type, IP address, and other technical details."
                        ),
                        EmphasizedParagraph(
                            emphasis = "Push Notifications:",
                            continuation = """
                                Push Notifications: We may ask to send you push notifications for updates related to your account or platform features.
                                You can turn off notifications in your device settings.
                            """.trimIndent()
                        )
                    )
                ),
                PlainParagraph(
                    content = """
                        This information is essential for ensuring the platform's security, troubleshooting, and internal analytics.
                        Please ensure that the personal information you provide is accurate, complete, and up to date. Notify us of any changes promptly.
                    """.trimIndent()
                )
            )
        ),
        LegalSection(
            title = "Automatically Collected Information",
            paragraphs = listOf(
                PlainParagraph("In Short: Some data (like device and browser information) is collected automatically when you use our platform."),
                BulletedParagraph(
                    pretext = """
                        We automatically gather certain details during your visit to or use of our platform. Although this data does not reveal your identity, 
                        it includes technical and usage information such as your IP address, browser type, device details, operating system, language preferences, 
                        referring URLs, and information on your interactions with our services. This helps us maintain platform security, run diagnostics, 
                        and perform analytics. The types of information collected include:
                    """.trimIndent(),
                    bullets = listOf(
                        EmphasizedParagraph(
                            emphasis = "Logs and Usage Data:",
                            continuation = """
                                This includes service-related information such as your IP address, device details, browser settings, 
                                usage activity (e.g., time stamps, pages viewed, and actions taken), and system activity (e.g., error reports or hardware settings).
                            """.trimIndent()
                        ),
                        EmphasizedParagraph(
                            emphasis = "Device Data:",
                            continuation = """
                                We collect details about the device you use to access our services, such as your IP address, device ID, browser type, and operating system.
                            """.trimIndent()
                        ),
                        EmphasizedParagraph(
                            emphasis = "Location Data:",
                            continuation = """
                                We may collect your device location data, which can be precise or approximate, depending on your device settings. 
                                You can opt out of location data collection by disabling location services on your device, 
                                but this may limit certain functionalities of our services.
                            """.trimIndent()
                        )
                    )
                )
            )
        )
    )
)