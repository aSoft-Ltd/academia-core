package academia.registration

import koncurrent.Later

interface Verification {
    /**
     * Sends the verification code to the set destination provided that they have began the registration process
     * @param account email/phone number of the individual who has begun the registration process
     * @return the account that was passed in or an error if the [account] has not begun registration yet
     */
    fun sendCode(account: String): Later<StartRegistrationParams>

    /**
     * Retrieve verification information for the [account] that has begun registration
     */
    fun info(account: String): Later<StartRegistrationParams>

    /**
     * Perform the actual verification of with the [code] that has begun registration
     */
    fun verify(code: String): Later<StartRegistrationParams>
}