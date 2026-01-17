package academia.profile

import kotlinx.rpc.annotations.Rpc

@Rpc
interface SchoolProfile {
    /**
     * Removes all the records associated with the given school profile [uid].
     */
    suspend fun purge(uid: String)
}