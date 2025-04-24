fun main() {
    // Operasi Boolean
    val finalExamScore = 88
    val attendanceRate = 75

    val hasPassed = hasPassedFinalExam(finalExamScore) && hasGoodAttendance(attendanceRate)

    println(hasPassed)
}

fun hasPassedFinalExam(finalExamScore: Int): Boolean {
    val passThreshold = 75
    return finalExamScore > passThreshold
}

fun hasGoodAttendance(attendanceRate: Int): Boolean {
    val attendanceThreshold = 89
    return attendanceRate > attendanceThreshold
}