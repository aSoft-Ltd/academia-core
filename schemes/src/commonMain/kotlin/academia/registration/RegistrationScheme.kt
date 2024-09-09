package academia.registration

import koncurrent.Later

/**
 * An interface to help with the registration process for methods that are unverified/untrusted (i.e. Phone/Email)
 */
interface RegistrationScheme {
    /**
     * This should kick of the registration process
     */
    fun start(school: SchoolParams, person: PersonParams): Later<StartRegistrationParams>

    /**
     * This should kick of the registration process
     */
    fun start(params: StartRegistrationParams): Later<StartRegistrationParams>

    /**
     * Should check to see if the school can be registered
     */
    fun canRegister(params: SchoolParams): Later<SchoolParams>

    val verification: Verification

    /**
     * Set up different configuration parameters
     */
    fun configure(credentials: ConfigurationParams): Later<ConfigurationParams>

    /**
     * Provided that an [account] has [start]ed the registration process but not [finish]ed,
     * this method should be able to abort the registration process and delete the account
     */
    fun abort(account: String): Later<String>

    /**
     * finish the registration process by actually creating an account that someone can now log in
     */
    fun finish(account: String): Later<String>
}