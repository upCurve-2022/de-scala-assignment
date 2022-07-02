
//task 01
val num1:Int=5
val num2:Int=10
var largest: Int = 0
largest = if (num1 > num2) num1 else num2
println("Largest number is: "+largest)

//task 02
val num1:Int=10
val num2:Int=7
var result: Int = 0
result= (num1*num1)+num2
println("Result: "+result)

//task 03
lazy val list01 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
println(list01)

//task 04
val list02= list01 :+ 11
println(list02)

//task 05
val list03= 0 ::list02
println(list03)

//task06
val list04=list01 ::: list03
println(list04)

//task07
val list05= 0+: list01 :+11


//task08
val list06= list05.reverse

//task09

def squareInt( a:Int ) : Int = {
  var square:Int = 0
  square = a*a
  return square
}
print(squareInt(10))

//task10
val list07= list01.map(i=>i*i)



