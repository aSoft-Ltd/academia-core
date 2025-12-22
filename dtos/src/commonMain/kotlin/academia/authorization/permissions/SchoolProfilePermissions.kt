package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface SchoolProfilePermissions : Permission {

    @Serializable
    sealed interface CampusPermissions : SchoolProfilePermissions {
        @Serializable
        data object Create : CampusPermissions

        @Serializable
        data object Update : CampusPermissions

        companion object {
            val all: List<CampusPermissions> by lazy { listOf(Create, Update) }
        }
    }

    @Serializable
    data object Delete : SchoolProfilePermissions


    companion object Companion {
        val all: List<Permission> by lazy {
            buildList {
                addAll(CampusPermissions.all)
                add(Delete)
            }
        }
    }
}