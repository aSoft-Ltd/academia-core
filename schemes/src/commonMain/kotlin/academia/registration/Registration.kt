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
     * @return a uid that identifies the registration session.
     */
    suspend fun start(params: RegistrationParams): String

    /**
     * Resends verification or registration details to the specified [uid].
     */
    suspend fun resend(uid: String): String

    /**
     * Verifies the account associated with the given [uid] and [code].
     *
     * @return the uid of the verified account.
     */
    suspend fun verify(uid: String, code: String): String

    /**
     * Configures password for the newly created account.
     */
    suspend fun configure(params: PasswordConfigurationParams)
}