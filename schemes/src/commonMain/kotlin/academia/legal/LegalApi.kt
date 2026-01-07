package academia.legal

import academia.legal.privacy.PrivacyPolicy

interface LegalApi {
    suspend fun privacyPolicy(): PrivacyPolicy
}