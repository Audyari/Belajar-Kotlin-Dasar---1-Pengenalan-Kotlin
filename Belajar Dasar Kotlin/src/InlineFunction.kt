// Inline Function

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello1(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}



fun main() {
    println(hello { "Audyari" })
    println(hello { "Wiyono" })

    // Noinline

    println(hello1({ "Eko" }, { "Khannedy" })) 

}