println("Hello world")
//task 01: Get the largest number from two numbers
println("The largest of two number is"+Math.max(30,9))
//task 02: Get Square of a number and add with another number
val a=4
val b=9
lazy val result=Math.pow(a,2)+b
println("The sum of square of a plus b is "+ result)
//task 03: Create a lazy val List list01 of 1 - 10
lazy val list01=(1 to 10).toList.map(x=>x)
println(list01)
//task 04: add 11 to list01 at the end
lazy val list04=list01 :+11
println(list04)
//task 05: add 0 to the beginning of the list from task 04
lazy val list05= 0 +: list04
println(list05)
//task 06: Do task 03, 04, 05 in one line
lazy val list06 =0+:list01:+11
println(list06)
//task 07: concatenate list in task 03 and task 05
lazy val concatList=List.concat(list01,list05)
println(concatList)
//task 08: reverse the list from task 06
lazy val reverseList=list06.reverse
println(reverseList)

//task 09: write task 02 as a function instead and call the function in the next line
def squareAdd(x:Int,y:Int):Int={
  x*x +y
}
println("The result is "+squareAdd(3,4))
lazy val squareList=list01.flatMap(x=>List(x,x*x))
println(squareList)
