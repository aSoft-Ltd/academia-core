package academia.legal.privacy.sections

import academia.legal.tools.paragraph.EmphasizedParagraph
import academia.legal.tools.paragraph.PlainParagraph

internal fun summary() = listOf(
    PlainParagraph(
        """
            This summary highlights the main aspects of our Privacy Notice. For further details on any specific topic, 
            please refer to the corresponding sections using the table of contents below.
            """.trimIndent()
    ),
    EmphasizedParagraph(
        emphasis = "What personal information do we collect?",
        continuation = """
                When you visit, use, or navigate our platform, we may process your personal information based on how you interact with us, 
                the choices you make, and the features you use. More information about the personal data you provide can be found in section 
                (WHAT INFORMATION DO WE COLLECT).
            """.trimIndent()
    ),
    EmphasizedParagraph(
        emphasis = "How do we process your information?",
        continuation = """
                We use your information to provide and improve our services, communicate with you, enhance security, 
                prevent fraud, and comply with legal obligations. We may also process your information for other purposes with your consent. 
                For more details, see section (HOW DO WE PROCESS YOUR INFORMATION).
            """.trimIndent()
    ),
    EmphasizedParagraph(
        emphasis = "When and with whom do we share personal information?",
        continuation = """
                We share your personal information in specific situations and with particular third parties. 
                Learn more about these circumstances in section (WHEN AND WITH WHOM DO WE SHARE YOUR PERSONAL INFORMATION?).
            """.trimIndent()
    ),
    EmphasizedParagraph(
        emphasis = "How do we ensure your information's security?",
        continuation = """
                We have appropriate organizational and technical measures in place to safeguard your personal data. 
                However, no internet transmission or data storage system can be completely secure, 
                and we cannot guarantee protection from unauthorized access by hackers or other malicious actors. 
                For more on this, see section (HOW DO WE KEEP YOUR INFORMATION SAFE?)
            """.trimIndent()
    ),
    EmphasizedParagraph(
        emphasis = "What are your rights?",
        continuation = """
                Depending on your location, you may have certain legal rights regarding your personal information. 
                More details are available in section (WHAT ARE YOUR PRIVACY RIGHTS?).
            """.trimIndent()
    )
)