package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main() {
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    // DITAMBAHKIN di sini ↓↓↓
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
    println("Grade: $grade")
}