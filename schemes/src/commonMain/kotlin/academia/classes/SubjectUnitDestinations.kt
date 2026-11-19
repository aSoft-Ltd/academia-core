package academia.classes

import academia.classes.ClassesDestinations.ClassDestinations.SubjectDestinations

interface SubjectUnitDestinations {
    fun subjects(): String
    fun subject(uid: String): SubjectDestinations
}