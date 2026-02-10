package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

// CHECKPOINT 4: Expression Body Function
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    // CHECKPOINT 3: When Expression
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }
    println("Grade: $grade")

    // CHECKPOINT 4: Panggil fungsi
    println("Status: ${calculateStatus(score)}")
}