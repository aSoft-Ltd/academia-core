package academia.registration

import kotlinx.serialization.Serializable

@Serializable
data class SchoolParams(
    var name: String?,
    var domain: String?,
    var color: String?
) {
    companion object {
        val Default by lazy { SchoolParams("", "", "#00ff00") }
    }
}