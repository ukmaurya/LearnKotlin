fun main() {
 // WE WILL SEE WHILE LOOP FIRST
 println("HERE USING WHILE LOOP")
 var count = 5
 while (count >= 1)
 {
  println("this is loop")
  count--
 }


//PRINTING TABLE OF TWO USING WHILE LOOP
 println("now printing table of two")


 var number = 2
 var index = 1
 while (index <= 10)
 {
  println(number*index)
  index++
 }
 println("Outside Loop - " + index)  //IT WILL TELL US WHEN INDEX VALUE IS MORE THAN 10


// NOW WE WILL SEE DO-WHILE LOOP
 println("NOW USING DO-WHILE LOOP")
 var index2 = 5
 do {
 println("Hello")
 }while (index2 >5)   //it prints the do condition first and check the condition later so it will definitely print once


 // NOW WE WILL SEE FOR LOOP
 println("NOW USING FOR LOOP")
 for(i in 1..5){
  println(i)
 }
  println("now jump two values")
 for(i in 1..5 step 2){
  println(i)
 }

  println("Until range")
  for(i in 1 until 5){
   println(i)
  }

 println("Reverse Loop")
 for(i in 10 downTo 1){
  println(i)
 }

 println("Reverse Loop step 2")
 for(i in 10 downTo 1 step 2){
  println(i)
 }

 println("Printing table using for loop")
 val num = 2
 for(i in 1..10){
  println(num*i)
 }
 println("we can format it")

 for (i in 1..10){
//Formatting table style
  println(num.toString() + " x " + i + " = " + (num*i))
 }

 println("we can format it using string templating too")
 for (i in 1..10){
//WE CAN DO THE SAME USING STRING TEMPLATING
  println("$num x $i = ${num*i}")
 }
}
