package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Gaji tidak boleh negatif! Nilai tidak diubah.")
            } else {
                field = value
                println("Gaji $name berhasil diupdate menjadi Rp$field")
            }
        }

    private var performanceRating: Int = 3

    fun updatePerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
            println("Rating performa $name diubah menjadi $performanceRating")
        } else {
            println("WARNING: Rating harus antara 1-5!")
        }
    }

    fun getPerformanceRating(): Int {
        return performanceRating
    }
}