import java.util.*

// Anonymous Function

fun main() {
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return ""
        }
        return value.uppercase(Locale.getDefault())
    }

    val result = hello("Audyari Wiyono", anonymousUpper)
    println(result)

    // Anonymous Function as Parameter
    val resultl = hello("Audy", fun(value: String): String {
        if (value.isBlank()) {
            return ""
        }
        return value.uppercase(Locale.getDefault())
    })
    println(resultl)
}