package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface WebsitePermissions : Permission {
    @Serializable
    data object View : Permission

    @Serializable
    data object Manager : Permission

    companion object {
        val all by lazy { listOf(View,Manager) }
    }
}