package academia.pricing

import kotlinx.rpc.annotations.Rpc

@Rpc
interface Pricing {
    suspend fun current(): PricingMatrix
    suspend fun load(uid: String): PricingMatrix?
}