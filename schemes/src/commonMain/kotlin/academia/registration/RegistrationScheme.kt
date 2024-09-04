package academia.registration

import koncurrent.Later

/**
 * An interface to help with the registration process for methods that are unverified/untrusted (i.e. Phone/Email)
 */
interface RegistrationScheme {
    /**
     * This should kick of the registration process
     */
    fun start(school: SchoolParams, person: PersonParams): Later<RegistrationInfo>

    /**
     * Sends the verification code to the set destination provided that they have began the registration process
     * @param account email/phone number of the individual who has begun the registration process
     * @return the account that was passed in or an error if the [account] has not begun registration yet
     */
    fun sendVerificationCode(account: String): Later<String>

    /**
     * Verifies that the account holder is indeed the owner of the email/phone they claim to have registered with
     */
    fun verify(code: String): Later<VerificationResult>

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
    fun finish(code: String): Later<String>
}