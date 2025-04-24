fun main(){

    // For Array

    val members: Array<String> = arrayOf("Auditory", "Winnow", "Bud")
    for (member in members) {
        println(member)
    }

    // For Range
    for (value in 0..100) {
        println(value)
    }

    for (value in 1000 downTo 0 step 5) {
        println(value)
    }

    // gabungan data range dan data array
    val names = arrayOf("Adit", "Budi", "Cici", "Dina", "Eka")
    for (index in names.indices) {
        println("Index ke-$index: ${names[index]}")
    }

}
