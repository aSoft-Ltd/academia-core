package academia.registration

import kotlinx.rpc.annotations.Rpc

@Rpc
interface RegistrationCheck {
    /**
     * Checks to see if a school with [params] can be registered
     *
     * @return the [params] if the school can be registered or null if it cannot
     */
    suspend fun school(params: SchoolParams): SchoolParams?

    /**
     * Checks to see if a person with [params] can be registered
     *
     * @return the [params] if the person can be registered
     */
    suspend fun person(params: PersonParams): PersonParams
}