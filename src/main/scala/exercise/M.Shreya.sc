//task 01: Get the largest number from two numbers
val num1=9
val num2=100
//Approach 1
val result= if (num1>num2) num1 else num2
println(s"The largest number is : $result")
//Approach 2
println("The largest number is : " + num1.max(num2))


//task 02: Get Square of a number and add with another number
val result = (num1*num1)+num2


//task 03: Create a lazy val List list01 of 1 - 10
lazy val list01 = List.range(1, 11)
println(list01)


//task 04: add 11 to list01 at the end
val list01_end = list01 :+ 11


//task 05: add 0 to the beginning of the list from task 04
val list01_start = 0 +: list01_end


//task 06: Do task 03, 04, 05 in one line
val extendedList = 0 +: List.range(1,11) :+ 11


//task 07: concatenate list in task 03 and task 05
//try doing it in a single line
val concatenatedList = List.concat(list01, list01_start)


//task 08: reverse the list from task 06
val reversedList = extendedList.reverse


//task 09: write task 02 as a function instead and call the function in the next line
def compute(x: Int, y: Int) : Int = {
  (x*x)+y
}
compute(num1, num2)


//Optional task 10: list with a square of the input list01
val squaredList : List[Int] = list01.map(x => x*x)