//task 01: Get the largest number from two numbers
val num1 = 12
val num2 = 34
val max = if (num1 > num2) num1 else num2
println(s"The largest among ${num1} and ${num2} is ${max}")

//task 02: Get Square of a number and add with another number
val square = Math.pow(5,2)
val final_ans = square + 9
println(s"Adding the square of 5 to 9 we get ${final_ans}")

//task 03: Create a lazy val List list01 of 1 - 10
lazy val list01 = (1 to 10).map(x => x).toList
println(list01)

//task 04: add 11 to list01 at the end
lazy val list02= list01 :+ 11
println(list02)

//task 05: add 0 to the beginning of the list from task 04
lazy val list03 = 0 :: list02
println(list03)

//task 06: Do task 03, 04, 05 in one line
lazy val list04 = 0 +: (1 to 10).map(x => x).toList :+ 11
println(list04)

//task 07: concatenate list in task 03 and task 05
lazy val list05 = List.concat(list01, list03)
println(list05)

//task 08: reverse the list from task 06
lazy val list06 = list04.reverse
println(list06)

//task 09: write task 02 as a function instead and call the function in the next line
def square_add(x:Double, y:Double): Double = {
  val square = Math.pow(x,2)
  square + y
}

println(s"On adding the square of 5 and 9 we get ${square_add(5, 9)}")

//Optional task 10: list with a square of the input list01

//list with input and its squares
lazy val squaredList = list01.flatMap(x => List(x, x*x))
println(squaredList)

//list with only the squares of the input
lazy val squaredList02 = list01.map(x=> x*x)
println(squaredList02)
