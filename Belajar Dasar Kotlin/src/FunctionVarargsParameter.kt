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

fun main() {
    sayHello3("Audyari")
    sayHello3("Audyari", "Eko")

    cetakTriple(Triple("Audyari", 21, true))
}