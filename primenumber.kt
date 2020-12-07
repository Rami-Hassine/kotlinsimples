
fun primenamber(number:Int){

    println("number $number is prime :" +isprime(number))
}
fun isprime(number:Int):Boolean {
    var result=true
    for (i:Int in 2 until number){

        if (number % i==0){
            result=false
            break
        }

    }
    return result
}
fun main(args: Array<String>) {
    println("donner un entier : ")
    val number:Int= readLine()!!.toInt()
    primenamber(number)
    isprime(10)
}
