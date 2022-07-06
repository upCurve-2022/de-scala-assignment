//Task 1 : Get the largest number from two numbers

val val1: Int = 23
val val2: Int = 235
val largest: Int = if (val1 > val2) val1 else val2
println(largest)


//task 02: Get Square of a number and add with another number
val num1=4
val num2=20
println((num1*num1)+num2)



//task 03: Create a lazy val List list01 of 1 - 10
lazy val list01=List(1,2,3,4,5,6,7,8,9,10)
println("list01 = ",list01)
//Another approach
//lazy val range=Range(1,11)
//lazy val aList=range.toList
//println(aList)

//task 04: add 11 to list01 at the end
println("After Appending 11 --> ",list01:+11)
//--------- As scala lists are immutable too,
// that means we cannot modify or append elements value of the list once it is assigned---------

val list02=list01:+11
println("list02 = ",list02)


//task 05: add 0 to the beginning of the list from task 04
println("After prepending 0 to appended 11 in list01 --> ",0+:list01:+11)
//---->lists are immutable so can't modified.
val list03=0+:list01:+11
println("list03 = ",list03)


//task 06: Do task 03, 04, 05 in one line
lazy val list0=0+:List(1,2,3,4,5,6,7,8,9,10):+11
println("list0 = ",list0)


//task 07: concatenate list in task 03 and task 05
//try doing it in a single line

val concatenatedList=List.concat(list01,list03)
println(s"concatenated list = $concatenatedList")


//task 08: reverse the list from task 06
println("Reversed List = ",list0.reverse)


//task 09: write task 02 as a function instead and call the function in the next line
println("square using function")
def square(a:Int):Int={a*a}
println(square(3)+7)


//Optional task 10: list with a square of the input list01
println("===== Squared list =====")
println(list01.map(item=>item*item))
