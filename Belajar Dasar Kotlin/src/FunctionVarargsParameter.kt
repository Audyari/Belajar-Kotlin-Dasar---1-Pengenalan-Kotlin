
fun sayHello3(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}

fun cetakTriple(vararg data: Triple<String, Int, Boolean>) {
    for (d in data) {
        println("Nama: ${d.first}, Umur: ${d.second}, Aktif: ${d.third}")
    }
}

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values) {
        total += value
    }
    val y = total / values.size
    println("Final Value $name = $total")
}

fun sayHello4(vararg values: Int, name: String) {
    var total = 0
    for (value in values) {
        total += value
    }
    println("Hello $name, Final Value = $total")
}

fun finalValueNoVarargs(name: String, values: Array<Int>) {
    var total = 0
    for (value in values) {
        total += value
    }
    val y = total / values.size
    println("Final Value $name = $total")
}



fun main() {
    sayHello3("Audyari")
    sayHello3("Audyari", "Eko")

    cetakTriple(Triple("Audyari", 21, true))

    finalValue("Audyari", 10, 20, 30)

    sayHello4(10, 20, 30, name = "Audyari")

    finalValueNoVarargs("Audyari", arrayOf(10, 20, 30))
}