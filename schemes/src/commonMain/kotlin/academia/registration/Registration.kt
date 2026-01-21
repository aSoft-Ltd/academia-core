package academia.registration

import academia.curriculum.Curriculum
import kotlinx.coroutines.flow.Flow
import kotlinx.rpc.annotations.Rpc

@Rpc
interface Registration {

    /**
     * Suggest school domain names based on the provided school name.
     */
    fun suggest(name: Flow<String>): Flow<Suggestion>

    /**
     * Attempts to begin a registration process for the given school parameters.
     */
    suspend fun attempt(school: SchoolParams): List<Curriculum>

    /**
     * Kicks off the registration process with the provided parameters.
     *
     * @return a registration session identifier (uid).
     */
    suspend fun start(params: RegistrationParams): String

    /**
     * Resends verification or registration details to the specified [uid].
     * @param uid registration session identifier
     */
    suspend fun resend(uid: String): String

    /**
     * Verifies the account associated with the given [uid] and [code].
     *
     * @param uid registration session identifier
     * @param code verification code
     * @return the uid of the verified account.
     */
    suspend fun verify(uid: String, code: String): String

    /**
     * Gets the account identifier associated with the given [uid]
     *
     * @return the account (email/password) used to register the account
     */
    suspend fun account(uid: String): String?

    /**
     * Configures password for the newly created account.
     * @param code verification code
     * @param password desired password
     */
    suspend fun configure(code: String, password: String)
}