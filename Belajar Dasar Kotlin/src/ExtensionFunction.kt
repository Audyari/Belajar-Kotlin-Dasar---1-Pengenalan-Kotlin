fun String.hello(): String {
    return "Hello $this"
}

fun main() {

    // Extension Function

    val name = "Audyari Wiyono"
    val hello = name.hello()
    println(hello)
}