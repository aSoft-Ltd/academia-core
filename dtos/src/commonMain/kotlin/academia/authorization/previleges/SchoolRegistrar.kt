package academia.authorization.previleges

import academia.authorization.permissions.Permission
import academia.authorization.permissions.SchoolProfilePermissions
import academia.authorization.permissions.WebsitePermissions
import kotlinx.serialization.Serializable

@Serializable
data object SchoolRegistrar : Privilege {
    override val permissions by lazy {
        emptyList<Permission>() +
                WebsitePermissions.all +
                SchoolProfilePermissions.all
    }
}