fun main(){
    val isRaining = false

    if (isRaining){
        println("Take Umbrella")
    }
    else{
        println("Umbrella not required")
    }

    println("Next code is going to run")

    val x =10
    val y =12

    if (x > y){
        println("X is greater than Y")
    }
    else if (x < y){
        println("X is less than Y")
    }
    else{
        println("X and Y are equal")
    }

        println("here is one more way to run if-else statement:")
    val result = if (x>y){
        "X is greater than Y"
    }
    else if (x<y){
        "X is less than Y"
    }
    else{
        "both are equal"
    }
    println(result)

    //ANOTHER CONDITION
        println("here is one more way to run if-else statement:")

    val number = 20
    val show = if(number % 2 == 0) "Even" else "Odd"
    
    println(show)
}