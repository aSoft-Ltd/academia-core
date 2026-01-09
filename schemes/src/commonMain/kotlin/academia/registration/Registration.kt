package academia.registration

import kotlinx.coroutines.flow.Flow
import kotlinx.rpc.annotations.Rpc

@Rpc
interface Registration {

    /**
     * Suggest school domain names based on the provided school name.
     */
    fun suggest(name: Flow<String>): Flow<Suggestion>

    /**
     * Starts the registration process for a school with the given parameters
     */
    suspend fun start(school: SchoolParams): SchoolParams
}