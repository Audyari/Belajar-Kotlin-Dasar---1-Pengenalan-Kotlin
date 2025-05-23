
fun main() {
    
    // Tail Recursive Function

    tailrec fun display(value: Int) {
        println(value)
        if (value > 0) {
            display(value - 1)
        }
    }

    // Tail Recursive Factorial Function

    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }




    display(80000)
    println(" ")
    println(factorialTail(5))
}