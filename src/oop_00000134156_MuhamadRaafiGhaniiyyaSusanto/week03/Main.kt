package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    val emp = Employee("Budi")
    println("Mencoba set gaji 5000:")
    emp.salary = 5000
    println("Gaji sekarang: ${emp.salary}")

    println("\nMencoba set gaji -1000 (harus ditolak):")
    emp.salary = -1000
    println("Gaji sekarang: ${emp.salary}")
}