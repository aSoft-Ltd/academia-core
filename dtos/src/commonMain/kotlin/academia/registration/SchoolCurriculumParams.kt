package academia.registration

import academia.curriculum.Curriculum
import academia.curriculum.EducationLevel

class SchoolCurriculumParams(
    val options: List<Curriculum>,
    var curriculum: Curriculum?,
    var levels: MutableList<EducationLevel>
)