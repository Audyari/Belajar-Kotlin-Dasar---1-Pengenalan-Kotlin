fun main() {
    var counter = 0
    val lambdaIncrement: () -> Unit = {
        println("Incrementing counter")
        counter++
    }
    lambdaIncrement()
    lambdaIncrement()
    println("Counter value: $counter")
}