fun main() {
    
    // Function Default Argument
    sayHello("Audyari", "Wiyono")
    sayHello("Audyari")
    sayHello()

}

fun sayHello(firstName: String = "Audyari", lastName: String = "Wiyono") {
    println("Hello $firstName $lastName")
}
