fun main() {

        compareValues(10, 5)
        compareValues(11, 15)
}

// Operasi Perbandingan
fun compareValues(x: Int, y: Int) {
    println("Comparing $x and $y:")
    println("$x > $y : ${x > y}")
    println("$x < $y : ${x < y}")
    println("$x >= $y : ${x >= y}")
    println("$x <= $y : ${x <= y}")
    println("$x == $y : ${x == y}")
    println("$x != $y : ${x != y}")
}