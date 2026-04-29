package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main() {
    val name = "John Thor"
    val score = 80

    val grade = when (score) {
        in 85..100 -> "A"
        in 70..84 -> "B"
        in 60..69 -> "C"
        in 50..59 -> "D"
        else -> "E"
    }

    println("Nama: $name, Nilai: $score, Grade: $grade")
}