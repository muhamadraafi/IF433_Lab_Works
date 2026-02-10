package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }
    println("Grade: $grade")

    println("Status: ${calculateStatus(score)}")

    // CHECKPOINT 5: Null Safety
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}