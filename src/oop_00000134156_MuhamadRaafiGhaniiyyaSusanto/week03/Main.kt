package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    val emp = Employee("Budi")

    println("=== Testing Setter Gaji ===")
    emp.salary = 5000
    println("Gaji sekarang: ${emp.salary}")

    emp.salary = -1000
    println("Gaji sekarang: ${emp.salary}")

    println("\n=== Testing Performance Rating ===")
    println("Rating awal: ${emp.getPerformanceRating()}")
    emp.updatePerformanceRating(4)
    println("Rating sekarang: ${emp.getPerformanceRating()}")
    emp.updatePerformanceRating(6)  // Harus gagal
}