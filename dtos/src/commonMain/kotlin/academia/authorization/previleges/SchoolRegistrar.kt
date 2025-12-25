package academia.authorization.previleges

import academia.authorization.permissions.Permission
import academia.authorization.permissions.SchoolProfilePermissions
import academia.authorization.permissions.WebsitePermissions
import kotlinx.serialization.Serializable

@Serializable
data object SchoolRegistrar : Privilege {
    override val permissions: List<Permission> by lazy {
        buildList {
            addAll(WebsitePermissions.all)
            addAll(SchoolProfilePermissions.all)
        }
    }
}