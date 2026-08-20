package academia.classes

import academia.attendance.AttendanceDestinations

class ClassesDestinations(prefix: String, private val root: String) {
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun detail(uid: String) = ClassDestinations(this.prefix, uid)
    fun routes() = "$root/*"
    fun isolated() = ClassesDestinations("", root)

    class ClassDestinations(prefix: String, private val root: String) {
        private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
        fun index() = prefix
        fun students() = "$prefix/students"
        fun streams() = "$prefix/streams"
        fun stream(uid: String) = StreamDestinations(this.prefix, "streams/$uid")
        fun subjects() = "$prefix/subjects"
        fun subject(uid: String) = SubjectDestinations(this.prefix, "subjects/$uid")
        fun teachers() = "$prefix/teachers"
        fun attendance() = "$prefix/attendance"
        fun attendance(uid: String) = AttendanceDestinations(this.prefix, "attendance/$uid")
        fun routes() = "$root/*"
        fun isolated() = ClassDestinations("", root)

        class SubjectDestinations(prefix: String, private val root: String) {
            private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
            fun index() = prefix
            fun students() = "$prefix/students"
            fun topics() = "$prefix/topics"
            fun topic(uid: String) = TopicDestinations(this.prefix, "topics/$uid")
            fun periods() = "$prefix/periods"
            fun period(uid: String) = PeriodDestinations(this.prefix, "periods/$uid")
            fun attendance() = "$prefix/attendance"
            fun questions() = "$prefix/questions"
            fun routes() = "$root/*"
            fun isolated() = SubjectDestinations("", root)

            class PeriodDestinations(prefix: String, private val root: String) {
                private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
                fun index() = prefix
                fun plan() = PlanDestinations(this.prefix, "plan")
                fun routes() = "$root/*"
                fun isolated() = PeriodDestinations("", root)

                class PlanDestinations(prefix: String, private val root: String) {
                    private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
                    fun index() = prefix
                    fun routes() = "$root/*"
                    fun isolated() = PlanDestinations("", root)
                }
            }

            class TopicDestinations(prefix: String, private val root: String) {
                private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
                fun index() = prefix
                fun subtopic(uid: String) = SubtopicDestinations(this.prefix, "subtopics/$uid")
                fun routes() = "$root/*"
                fun isolated() = TopicDestinations("", root)

                class SubtopicDestinations(prefix: String, private val root: String) {
                    private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
                    fun index() = prefix
                    fun generalPlan() = "$prefix/general-plan"
                    fun lessonDevelopment() = "$prefix/lesson-development"
                    fun routes() = "$root/*"
                    fun isolated() = SubtopicDestinations("", root)
                }
            }
        }

        class StreamDestinations(prefix: String, private val root: String) {
            private val prefix by lazy { if (prefix.isEmpty()) root else "$prefix/$root" }
            fun index() = prefix
            fun students() = "$prefix/students"
            fun subjects() = "$prefix/subjects"
            fun teachers() = "$prefix/teachers"
            fun attendance() = "$prefix/attendance"
            fun fees() = "$prefix/fees"
            fun routes() = "$root/*"
            fun isolated() = StreamDestinations("", root)
        }
    }
}