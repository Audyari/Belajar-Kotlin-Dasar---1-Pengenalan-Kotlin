import java.util.*

// Method References 2
fun toUpper1(value: String): String = value.uppercase(Locale.getDefault())


// Lambda Expression di Variable
fun main() {
  
    // membuat lamda 1
    val lambdaName1: (String) -> String = { value: String ->
        value.uppercase(Locale.getDefault())
    }
 
    // memanggil lamda 1
    val result = lambdaName1("Audyari W di variabel")
    println(result)

    // membuat lambda 2
    val lambdaName2: (String) -> String = ::toUpper1

    // Method References 2
    val result2 = lambdaName2("Audyari W di method")
    println(result2)

    // It
    // membuat lambda 3
    val lambdaName3: (String) -> String = {
        it.uppercase(Locale.getDefault())
    }

    // mengeksekusi lambda 3
    val name = lambdaName3("Audy")
    println(name)
}