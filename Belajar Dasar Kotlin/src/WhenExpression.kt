fun main() {
    
    // When Expression
    val examScore = 90
    when (examScore) {
        90 -> println("A")
        80 -> println("B")
        70 -> println("C")
        60 -> println("D")
        50 -> println("E")
        else -> println("F")
    }

    // When Expression Multiple Option
    val examValue = 90
    when (examValue) {
        90, 80 -> println("A")
        70 -> println("B")
        60 -> println("C")
        50 -> println("D")
        else -> println("F")
    }

    // When Expression In
    val examValue1 = 90
    when (examValue1) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        in 50..59 -> println("E")
        else -> println("F")
    }

    // When Expression Is
    val name = "Audyari W"
    when (name) {
        is String -> println("This is String")
        else -> println("This is not String")
    }

    // When Tanda Variable
    val examValue3 = 90
    when { 
        examValue3 > 89 -> println("Good Job")
        examValue3 > 68 -> println("Not Bad")
        else -> println("Try again next year")
    }
}