fun main() {

    // Tipe Data Range
   val range = 0..1000 
   
   for (value in range) {
        println(value)
    }

    // Range Terbalik

    val reverseRange = 1000 downTo 0 step 5
    for (value in reverseRange) {
        println(value)
    }

    // Range Dengan Step

    val stepRange = 1..100 step 10
    for (value in stepRange) {
        println(value)
    }
}
