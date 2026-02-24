package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    val e = Employee("Budi")

    println("Mencoba set gaji 5000:")
    e.salary = 5000

    println("\nMencoba set gaji -100:")
    e.salary = -100

    println("\nGaji akhir: ${e.salary}")
}