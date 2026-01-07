package academia.authorization.previleges

import kotlinx.serialization.Serializable
import academia.authorization.permissions.Permission

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