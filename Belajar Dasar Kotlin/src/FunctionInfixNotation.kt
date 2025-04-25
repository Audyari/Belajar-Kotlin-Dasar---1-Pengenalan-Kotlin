import java.util.*

// Function Infix Notation

infix fun String.to(type: String): String {
    return if (type == "uppercase") {
        this.uppercase(Locale.getDefault())
    } else {
        this.lowercase(Locale.getDefault())
    }
}

fun main() {
    val result: String = "Audyari Wiyono" to "uppercase"
    println(result)

    val result2: String = "Audyari Wiyono" to "lowercase"
    println(result2)

}