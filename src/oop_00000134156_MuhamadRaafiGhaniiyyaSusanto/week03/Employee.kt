package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
                println("Gaji ${this.name} diubah menjadi $value")
            } else {
                println("Gaji tidak boleh negatif!")
            }
        }

    private var performanceRating: Int = 3  // Private property

    fun setPerformanceRating(rating: Int) {
        if (rating in 1..5) {
            performanceRating = rating
            println("Rating kinerja ${this.name} diubah menjadi $rating")
        } else {
            println("Rating harus antara 1-5")
        }
    }

    fun getPerformanceRating(): Int {
        return performanceRating
    }
}