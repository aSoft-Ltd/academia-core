package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface AdmissionPermissions : Permission {
    @Serializable
    data class View(val level: String) : Permission

    @Serializable
    data class Manager(val level: String) : Permission

    companion object {
        val all by lazy { listOf(View("*"), Manager("*")) }
    }
}