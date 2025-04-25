
fun main(){

    // Factorial For Loop

    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
     return result
    }

    // Factorial Recursive

    fun factorialRecursive(value: Int): Int {
        return when (value) {
          1 -> 1
          else -> value * factorialRecursive(value - 1)
       }
}

    println(factorialLoop(5))
    println(factorialRecursive(5))
}