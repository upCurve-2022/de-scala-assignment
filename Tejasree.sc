println("Hello")

//task 01: Get the largest number from two numbers
val num1:Int=3
val num2:Int=5
val large:Int= if(num1>num2)num1 else num2
println("Largest number:"+large)
//task 02: Get Square of a number and add with another number
val n: Int=4
lazy val square: Int=n*n
val sum: Int= square + 6
println(sum)
//Use only val. Don't use var
//you can try these with lazy val too
//task 03: Create a lazy val List list01 of 1 - 10
lazy val list01=(1 to 10).toList
//task 04: add 11 to list01 at the end
val list02 = list01:+11
//task 05: add 0 to the beginning of the list from task 04
val list03 = 0+:list02
//task 06: Do task 03, 04, 05 in one line
val mylist = 0 +: (1 to 10).toList :+ 11
//task 07: concatenate list in task 03 and task 05
//try doing it in a single line
val list04 = List.concat(list01,list03)
//task 08: reverse the list from task 06
val revlist = mylist.reverse
//task 09: write task 02 as a function instead and call the function in the next line
def squaresum(s:Int,a:Int):Int={
var sqsum: Int= s*s + a
return sqsum
}
val res=squaresum(4,6)
//Optional task 10: list with a square of the input list01
val sqlist = list01.map(x => x*x)