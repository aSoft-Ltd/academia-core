package academia.legal.privacy

import academia.legal.privacy.sections.controlsForDoNotTrackFeature
import academia.legal.privacy.sections.doWeMakeUpdatesToThisNotice
import academia.legal.privacy.sections.howCanYouContactUsAboutThisNotice
import academia.legal.privacy.sections.howCanYouReviewUpdateOrDeleteTheDataWeCollectFromYou
import academia.legal.privacy.sections.howDoWeKeepYourInformationSafe
import academia.legal.privacy.sections.howDoWeProcessYourInformation
import academia.legal.privacy.sections.howLongDoWeKeepYourInformation
import academia.legal.privacy.sections.summary
import academia.legal.privacy.sections.whatAreYourPrivacyRights
import academia.legal.privacy.sections.whatInformationDoWeCollect
import academia.legal.privacy.sections.whatIsOurStanceOnThirdPartyWebsites
import academia.legal.privacy.sections.whenAndWithWhomDoWeShareYourPersonalInformation
import academia.legal.tools.paragraph.BulletedParagraph
import academia.legal.tools.paragraph.EmphasizedParagraph
import academia.legal.tools.paragraph.PlainParagraph

fun privacyPolicy(
    domain: String,
    inquiries: String
) = PrivacyPolicy(
    updated = "October 21, 2024",
    intro = listOf(
        EmphasizedParagraph(
            emphasis = "Academia",
            continuation = """
                is one of the asoft product (find more about asoft at https://asoft.co.tz/) that provides a comprehensive
                digital platform designed to streamline school management and enhance the flow of information across all levels 
                of school operations. It offers powerful insights into academic activities, financials and general school programs. 
                (Please visit our website at $domain. for more details about who the audience are and how they can benefit by using our platform)
            """.trimIndent()
        ),
        BulletedParagraph(
            pretext = """
                    Outlined here is a Privacy Notice for Academia which explains how and why we collect, access, store, use, 
                    and/or share (process) your personal information when you interact with our platform. This includes instances when you:
                """.trimIndent(),
            bullets = listOf(
                PlainParagraph("Visit our website at $domain, or any of our sites that reference this Privacy Notice"),
                PlainParagraph("Download and use our android application"),
                PlainParagraph("Download and use our ios application"),
                PlainParagraph("Download and use any of our desktop application (windows, macos_arm, macos_x64, linux)"),
                PlainParagraph("Engage with us through other Academia related activities, such as sales, marketing, or events")
            )
        ),
        EmphasizedParagraph(
            emphasis = "Note:",
            continuation = """
                This Privacy Notice is intended to help you understand your rights and choices regarding your personal information. 
                We are responsible for determining how your data is processed. If you disagree with our policies and practices, 
                please refrain from using our services. For further inquiries or concerns, feel free to contact us at $inquiries                
            """.trimIndent()
        )
    ),
    summary = summary(),
    sections = listOf(
        whatInformationDoWeCollect(),
        howDoWeProcessYourInformation(),
        whenAndWithWhomDoWeShareYourPersonalInformation(),
        whatIsOurStanceOnThirdPartyWebsites(),
        howLongDoWeKeepYourInformation(),
        howDoWeKeepYourInformationSafe(),
        whatAreYourPrivacyRights(),
        controlsForDoNotTrackFeature(),
        doWeMakeUpdatesToThisNotice(),
        howCanYouContactUsAboutThisNotice(inquiries),
        howCanYouReviewUpdateOrDeleteTheDataWeCollectFromYou(domain)
    )
)