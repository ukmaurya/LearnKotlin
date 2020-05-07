fun main(){
    val number = 15
    val result = number in 1..15 //upper bound is included
    println (result)

    val show = number in 1 until 15    // upper value is not included
    print(show)
}