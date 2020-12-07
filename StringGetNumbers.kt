fun StringGetNumbers(){
    val text ="This string contains 4 numbers and others are 345,9855,50"
    println("text =>" +text)

    val result:MutableList<Int> = mutableListOf<Int>()
    var numberStr=""

    for (i:Int in 0 until text.length ){
        val c:Char=text[i]
        if (c in '0'..'9'){
            numberStr+=c
            if (i == text.length-1){
                result.add(numberStr.toInt())
            }
        }
        else if (!numberStr.isNullOrBlank()){
            result.add(numberStr.toInt())

            numberStr=""
        }
    }
    println("numbers : " +result.joinToString(", "))
}
fun main(args: Array<String>) {
    StringGetNumbers()
}