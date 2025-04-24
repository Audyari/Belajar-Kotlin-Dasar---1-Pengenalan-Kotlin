fun printHello(name: String?): Unit {
    println(if (name == null) {
        "Hello Anonymous"
    } else {
        "Hello $name"
    })
}
fun main() {
    
    // Unit Returning Function
    printHello("Audyari Wiyono")
    printHello(null)
}