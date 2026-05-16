package academia.pricing

import kotlinx.rpc.annotations.Rpc

@Rpc
interface Pricing {
    suspend fun packages(): List<Package>
    suspend fun credits(): List<Credit>
}