fun main(args: Array<String>) {
    minNumberof2()
}
fun minNumberof2(){
    val number1=10
    val number2=20

    println("MinnumberIN2_V1($number1,$number2) ==> ${MinnumberIN2_V1(number1,number2)}")
    println("MinnumberIN2_V2($number1,$number2) ==> ${MinnumberIN2_V2(number1,number2)}")
}
fun MinnumberIN2_V1(n1:Int,n2:Int):Int{
    return if (n1<n2) n1 else n2
}
fun MinnumberIN2_V2(n1: Int,n2: Int):Int{
    return Math.min(n1,n2)
}