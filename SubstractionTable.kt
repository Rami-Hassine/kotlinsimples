fun printsubstractiontable(){
    for (y:Int in 0..10){
        for (x:Int in 0..10){
            var towrite=""
            if(y==0)
                if (x==0)
                    towrite="- "
                else
                    towrite="$x"
            else
                if (x==0)
                    towrite="$y"
                else
                    towrite="${x-y}"
        print(towrite.padStart(4,' '))
        }
    println()
    println()
    }
}
fun main(args: Array<String>) {
   printsubstractiontable()
}