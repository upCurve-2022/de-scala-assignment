package samplecodes

object Basics extends App {
  val someNumber: Int = 5
  println("someNumber: " + someNumber) //plus sign for concatenation
  println(s"someNumber: $someNumber") //called interpolated string
  var someOtherNumber = 6
  val something = "false"
  //someNumber = 7 //shows compile time error
  someOtherNumber = 10

  val someExpression = 5 + 7
  println(s"Some Expression: $someExpression")
  //Same thing in java is
  //int num1 = 5, num2 = 15, sum;
  //sum = num1 + num2;

  lazy val firstNumber = 6
  lazy val numberBlock = {
    println("I am lazy")
    20
  }
  //println(s"Lazy value: $numberBlock")

  //if-else
  val resultOfIfElse = if(someNumber > 5) println(s"$someNumber greater than 5")
  else if (someNumber < 5) println(s"$someNumber not greater than 5")
  else println(s"$someNumber is equal to 5")

  val increment = (x: Int) => x + 1
  println(s"Increment: ${increment(10)}")

  def simplyPrint(): Unit = {
    println(s"Simply print something")
  }
  simplyPrint()

  def addition(x: Int, y: Int): Int = {
    x + y
  }
  println(s"Addition: ${addition(10,20)}")
}
