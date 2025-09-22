package academia.admission

class SittingDestinations(prefix:String,private val root:String){
    private val prefix by lazy { if (prefix.isEmpty()) "" else "$prefix/$root" }
    fun index() = prefix
    fun supervisors() = "$prefix/supervisors"
    fun routes() = "$prefix/*"
    fun isolated() = SittingDestinations("", root)
}