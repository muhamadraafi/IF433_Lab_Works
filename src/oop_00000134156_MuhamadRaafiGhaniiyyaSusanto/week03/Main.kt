package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    val e = Employee("Budi")

    // Test salary
    e.salary = 5000

    // Test performance rating
    e.setPerformanceRating(4)
    println("Rating kinerja: ${e.getPerformanceRating()}")

    // Baris di bawah ini akan ERROR jika dijalankan (coba hapus komentar)
    // println(e.performanceRating)  // ERROR: Cannot access 'performanceRating'

    e.setPerformanceRating(6)  // Akan gagal
}