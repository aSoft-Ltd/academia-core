package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface Permission {
    companion object {
        val all by lazy {
            emptyList<Permission>() +
                    AdmissionPermissions.all +
                    WebsitePermissions.all +
                    SchoolProfilePermissions.all
        }
    }
}