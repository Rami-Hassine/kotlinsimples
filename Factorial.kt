import kotlin.time.measureTimedValue

fun factorial_iterative(value: Long): Long{
var result:Long=1
    var value:Long= value
    while (value>0){
        result *=value
        value-=1

    }
    return result
}
fun factorial_recursive(value: Long): Long {
    if (value == 0L || value == 1L) {
        return 1
    } else
        return value * factorial_recursive(value - 1)
}

fun main(args: Array<String>) {
    println("donner un entier : ")
var value:Long= readLine()!!.toLong()
println("with the iterative method is: ${factorial_iterative(value)}")
    println("with the recursion method is: ${factorial_recursive(value)}")
}