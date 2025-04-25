import java.util.*

// Higher-Order Functions
fun hello(value: String, transformer: (String) -> String): String {
    return transformer(value)
}

fun main() {
    val upperTransformer = { value: String -> value.uppercase(Locale.getDefault()) }
    val lowerTransformer = { value: String -> value.lowercase(Locale.getDefault()) }

    println(hello("Audyari Wiyono", upperTransformer))
    println(hello("Audyari Wiyono", lowerTransformer))


    // Trailing Lambda

    val result1 = hello("Eko") { value: String -> value.uppercase(Locale.getDefault()) }
    println(result1)

    val result2 = hello("Eko") { value: String -> value.lowercase(Locale.getDefault()) }
    println(result2)
}