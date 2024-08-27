package academia.registration

import koncurrent.Later
import koncurrent.TODOLater

class UnImplementedUntrustedRegistrationMethodService : UntrustedRegistrationMethodScheme {
    override fun start(school: SchoolParams, person: PersonParams): Later<Unit> = Later(Unit)

    override fun sendVerificationCode(account: String): Later<String> = Later(account)

    override fun verify(code: String) = Later(VerificationResult(account = "jane@doe.com"))

    override fun configure(credentials: ConfigurationParams): Later<ConfigurationParams> = Later(credentials)

    override fun abort(account: String): Later<String> = TODOLater()

    override fun finish(code: String): Later<String> = Later(code)
}