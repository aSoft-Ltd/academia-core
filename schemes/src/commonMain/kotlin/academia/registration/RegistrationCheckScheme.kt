package academia.registration

import koncurrent.Later

interface RegistrationCheckScheme {
    /**
     * Checks to see if a person with [params] can be registered
     *
     * @return a [Later] that will contain the [params] if the person can be registered
     */
    fun school(params: SchoolParams) : Later<SchoolParams>

    /**
     * Checks to see if a person with [params] can be registered
     *
     * @return a [Later] that will contain the [params] if the person can be registered
     */
    fun person(params: PersonParams) : Later<PersonParams>
}