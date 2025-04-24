fun main() {

    // If Expression
    val PASS_SCORE = 80
    val examScore = 90
    if (examScore > PASS_SCORE) {
        println("Good Job")
    }

    // Else Expression
    val examValue = 90
    if (examValue > 80) {
        println("good job" )
    } else {
        println("try again next year")
    }

    // Else If Expression
    val examValue1 = 90
    if (examValue1 > 88) {
        println("Good Job" )
    } else if (examValue1 > 68) {
        println("Not Bad" )
    } else {
        println("try again next year")
    }
}