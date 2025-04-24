fun sum(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Tidak boleh dibagi dengan 0")
    }
    val total = a / b
    return total
}

fun main() {
    val result = sum(9, 5)
    println(result)

    try {
        val result2 = sum(10, 0)
        println(result2)
    } catch (e: ArithmeticException) {
        println(e.message)
    }

}