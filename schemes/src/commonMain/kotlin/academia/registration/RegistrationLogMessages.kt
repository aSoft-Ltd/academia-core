package academia.registration

class RegistrationLogMessages {

    fun start(params: StartRegistrationParams) = "Registering ${params.person.name} from ${params.school.domain}"

    val check by lazy { Check() }

    class Check {
        fun school(params: SchoolParams) = "Checking if ${params.domain} is not already registered"

        fun person(params: PersonParams) = "Checking if ${params.account} is not already registered"
    }

    val verification by lazy { Verification() }

    class Verification {
        fun sendCode(account: String) = "Sending verification code to $account"
        fun info(account: String) = "Getting verification info for $account"
        fun verify(code: String) = "Verifying account that was sent code $code"
    }

    fun configure(credentials: PasswordConfigurationParams) = "Configuring registration for ${credentials.account}"
    fun finish(account: String) = "Finishing registration for $account"

    fun abort(account: String) = "Aborting registration for $account"
}