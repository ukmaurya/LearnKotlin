fun main() {
    val above70 = false
    val knowsPragramming = true

    // && AND
    var calledForInterview = above70 && knowsPragramming
    println(calledForInterview)

    // || OR
    calledForInterview = above70 || knowsPragramming
    println(calledForInterview)

    // false --> ! --> true
    // true --> ! --> false

    val answer = false
    val result = !answer
    println(result)     //true
}