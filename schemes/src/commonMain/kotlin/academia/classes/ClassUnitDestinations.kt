package academia.classes

import academia.classes.ClassesDestinations.ClassDestinations.StreamDestinations

interface ClassUnitDestinations : SubjectUnitDestinations {
    fun streams(): String
    fun stream(uid: String): StreamDestinations
}