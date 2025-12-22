package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface WebsitePermissions : Permission {
    @Serializable
    data object View : WebsitePermissions

    @Serializable
    data object Manager : WebsitePermissions

    companion object {
        val all : List<WebsitePermissions> by lazy { listOf(View, Manager) }
    }
}