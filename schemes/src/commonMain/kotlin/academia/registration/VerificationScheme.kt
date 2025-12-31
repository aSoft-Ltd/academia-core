package academia.registration

interface VerificationScheme {
    /**
     * Sends the verification code to the set destination provided that they have began the registration process
     * @param account email/phone number of the individual who has begun the registration process
     * @return the account that was passed in or an error if the [account] has not begun registration yet
     */
    suspend fun sendCode(account: String): StartRegistrationParams

    /**
     * Retrieve verification information for the [account] that has begun registration
     */
    suspend fun info(account: String): StartRegistrationParams

    /**
     * Perform the actual verification of with the [code] that has begun registration
     */
    suspend fun verify(code: String): StartRegistrationParams
}