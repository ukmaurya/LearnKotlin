fun main(){
    val animal = "Dog"
    if (animal == "Horse"){
        println("Horse")
    } else if (animal == "Cat"){
        println("Cat")
    } else if (animal == "Dog"){
        println("Dog")
    } else {
        println("Not Found")
    }


//OR WE CAN DO THE SAME THING USING WHEN
    when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat"   -> println("Animal is Cat")
        "Dog"   -> println("Animal is Dog")
        else    -> println("No Animal")
    }


//OR WE CAN DO THE SAME THING LIKE  THIS ALSO
    val result= when(animal){
        "Horse" -> "Animal is Horse"
        "Cat"   -> "Animal is Cat"
        "Dog"   -> "Animal is Dog"
        else    -> "No Animal"
    }
    println(result)


//ALSO WE CAN US WHEN CONDITION LIKE THIS
    val number = 13
    val show = when(number){
        11          -> "Eleven"
        12          -> "Twelve"
        in 13..19   -> "Teen"
        else        -> "not in range"
    }
    println(show)

}