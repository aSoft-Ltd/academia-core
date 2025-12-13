package academia.authorization.previleges

import academia.authorization.permissions.Permission
import kotlinx.serialization.Serializable

@Serializable
sealed interface Privilege {
    val permissions: List<Permission>

    companion object {
        val all by lazy {
            listOf(
                SchoolRegistrar
            )
        }
    }
}