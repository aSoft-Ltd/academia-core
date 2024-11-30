package academia.legal.privacy.sections

import academia.legal.privacy.LegalSection
import academia.legal.tools.paragraph.PlainParagraph

internal fun controlsForDoNotTrackFeature() = LegalSection(
    title = "CONTROLS FOR DO-NOT-TRACK FEATURES",
    paragraphs = listOf(
        PlainParagraph(
            content = """
                Most web browsers, as well as some mobile operating systems and applications, 
                offer a Do-Not-Track ("DNT") feature or setting that you can enable to indicate your preference for privacy by preventing 
                the monitoring and collection of data related to your online browsing activities. 
                Currently, there is no established universal standard for recognizing and implementing DNT signals. 
                Therefore, we do not respond to DNT signals from browsers or any other method that automatically conveys your desire not to be tracked online. 
                If a standard for online tracking is established in the future that we need to adhere to, 
                we will update this Privacy Notice to inform you about that practice.
            """.trimIndent()
        )
    )
)