package academia.registration

import academia.curriculum.Curriculum
import academia.curriculum.EducationLevel
import kotlinx.serialization.Serializable

@Serializable
data class SchoolCurriculumParams(
    val options: List<Curriculum>,
    var curriculum: Curriculum?,
    var levels: MutableList<EducationLevel>
) {
    companion object {
        val Empty by lazy { SchoolCurriculumParams(emptyList(), null, mutableListOf()) }
    }
}