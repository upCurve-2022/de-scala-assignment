
  println("Hello")
  /*
  Instructions:
  1. Write your code below the comment and click run. Results will be shown to your right.
  2. Run the worksheet once and check if you see "hello" to your right
  3. Use only val and not var
  4. Try out with lazy val too
  5. Try doing things in single or as less number of lines as possible.
   */

  //task 01: Get the largest number from two numbers
  println("1:")

  val num1 = 41.2
  val num2 = 66
  val maxNum = if(num1 >= num2) num1 else num2

  println(s"Maximum number out of $num1 and $num2: $maxNum \n")

  //task 02: Get Square of a number and add with another number
  println("2:")

  val num3 = 4
  val num4 = 66
  val result = num3 * num3 + num4

  //val result = scala.math.pow(num1,2) + num2
  println(f"Result of $num3 * $num3 + $num4: $result%.2f \n")

  //Use only val. Don't use var
  //you can try these with lazy val too
  //task 03: Create a lazy val List list01 of 1 - 10
  println("3:")

  lazy val list01 = (1 to 10).toList
  println (s"list01 of 1 - 10 : $list01 \n")

  //task 04: add 11 to list01 at the end
  println("4: ")

  val list02 = list01 :+ 11
  println (s"Appending 11 to the end of list01 : $list02 \n")

  //task 05: add 0 to the beginning of the list from task 04
  println("5: ")

  val list03 = 0 :: list01
  println (s"Appending 0 to the start of list01 : $list03 \n")

  //task 06: Do task 03, 04, 05 in one line
  println("6:")

  val list04 = (0 :: (1 to 10).toList) :+ 11
  println (s"Appending 0 and 11 together : $list04 \n")

  //task 07: concatenate list in task 03 and task 05
  //try doing it in a single line
  println("7:")

  val list05 = List.concat(list01,list03)
  println (s"Concatenating lists : $list05 \n")

  //task 08: reverse the list from task 06
  println("8:")

  val list06 = list04.reverse
  println ("Reversing list : " + list06 + "\n")

  //task 09: write task 02 as a function instead and call the function in the next line
  println("9:")

  def func2 (n1:Int, n2:Int) :Int = {
    n1*n1 + n2
  }

  println("Task2 as function : " + func2(2,3) + "\n")

  //Optional task 10: list with a square of the input list01
  println("10:")

  val list07 = list01.map( i => i*i)
  println (s"Square of list01 : $list07 \n")

