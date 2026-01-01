package academia.registration

interface RegistrationCheckScheme {
    /**
     * Checks to see if a person with [params] can be registered
     *
     * @return the [params] if the person can be registered
     */
    suspend fun school(params: SchoolParams): SchoolParams

    /**
     * Checks to see if a person with [params] can be registered
     *
     * @return the [params] if the person can be registered
     */
    suspend fun person(params: PersonParams): PersonParams
}