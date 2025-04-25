
// Return If

fun sayHello1(name: String = ""): String {
    return if (name.isEmpty()) {
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

// Return When

fun sayHello2(name: String = ""): String {
    return when (name) {
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {

 println(sayHello1())
    println(sayHello1("Audyari W"))

    println(sayHello2())
    println(sayHello2("Audyari W"))
}