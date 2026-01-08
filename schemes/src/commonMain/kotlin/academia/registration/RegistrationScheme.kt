package academia.registration

/**
 * An interface to help with the registration process for methods that are unverified/untrusted (i.e. Phone/Email)
 */
interface RegistrationScheme {

    val check: RegistrationCheck

    /**
     * This should kick of the registration process
     */
    suspend fun start(school: SchoolParams, person: PersonParams): StartRegistrationParams

    /**
     * This should kick of the registration process
     */
    suspend fun start(params: StartRegistrationParams): StartRegistrationParams


    val verification: VerificationScheme

    /**
     * Set up different configuration parameters
     */
    suspend fun configure(credentials: ConfigurationParams): ConfigurationParams

    /**
     * Provided that an [account] has [start]ed the registration process but not [finish]ed,
     * this method should be able to abort the registration process and delete the account
     */
    suspend fun abort(account: String): String

    /**
     * finish the registration process by actually creating an account that someone can now log in
     */
    suspend fun finish(account: String): String
}