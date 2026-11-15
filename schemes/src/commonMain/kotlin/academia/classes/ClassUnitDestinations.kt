package academia.classes

import academia.classes.ClassesDestinations.ClassDestinations.StreamDestinations
import academia.classes.ClassesDestinations.ClassDestinations.SubjectDestinations

interface ClassUnitDestinations {
    fun streams(): String
    fun stream(uid: String): StreamDestinations
    fun subjects(): String
    fun subject(uid: String): SubjectDestinations
}