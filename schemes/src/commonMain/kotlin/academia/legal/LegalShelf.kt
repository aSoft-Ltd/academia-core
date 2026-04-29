package academia.legal

import kotlinx.rpc.annotations.Rpc

@Rpc
interface LegalShelf {
    suspend fun latest(): Document
    suspend fun archived(): List<String>
    suspend fun version(uid: String): Document?
}