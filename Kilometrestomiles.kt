fun kilometrestomiles(){
    val kilometres=1.5
    println("KM($kilometres) ==> Miles(%f)".format(kilometres*1000/1609.344))
    println("KM($kilometres) ==> Miles(%.2f)".format(kilometres*1000/1609.344))
}
fun main(args: Array<String>) {
    kilometrestomiles()
}