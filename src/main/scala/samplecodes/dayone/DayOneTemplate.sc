println("Hello")

//task 01: Get the largest number
val largest = (x: Int, y: Int) => if (x > y) x else y
println(s"Largest Number: ${largest(10,20)}")

//task 02: Get Square of a number and add with another number
val squarePlusNumber = (x: Int, y: Int) => x * x + y
println(s"Largest Number: ${squarePlusNumber(10,20)}")

//Use only val. Don't use var
//you can try these with lazy val too
//task 03: Create a lazy val List list01 of 1 - 10
val list01: List[Int] = List.range(1,11)

//task 04: add 11 to list01 at the end
val list02: List[Int] = list01 :+ 11

//task 05: add 0 to the beginning of the list
val list03: List[Int] = 0 +: list02

//task 06: Do task 03, 04, 05 in one line
val list04: List[Int] = 0 +: List.range(1,11) :+ 11

//task 07: concatenate two lists
//trying doing it in a single line
val list05: List[Int] = List(1,2,3) ++ List(4,5,6)

//task 08: reverse the list01
val list06: List[Int] = list01.reverse

//task 09: write task 02 as a function instead and call the function in the next line
def findSquarePlusNumber(x: Int, y: Int): Int = x * x + y
findSquarePlusNumber(4,9)

//Optional task 10: list with a square of the input list - list01
val squareList: List[Int] = list01.map(x => x * x)