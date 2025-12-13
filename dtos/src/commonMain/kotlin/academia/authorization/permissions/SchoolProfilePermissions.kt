package academia.authorization.permissions

import kotlinx.serialization.Serializable

@Serializable
sealed interface SchoolProfilePermissions : Permission {

    @Serializable
    sealed interface CampusPermissions : Permission {
        @Serializable
        data object Create : Permission

        @Serializable
        data object Update : Permission

        companion object {
            val all by lazy { listOf(Create, Update) }
        }
    }

    @Serializable
    data object Delete : Permission


    companion object Companion {
        val all by lazy {
            CampusPermissions.all + Delete
        }
    }
}