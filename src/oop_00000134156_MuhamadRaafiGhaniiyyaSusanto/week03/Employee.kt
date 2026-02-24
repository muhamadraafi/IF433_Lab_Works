package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value  // Gunakan 'field' bukan 'this.salary'
                println("Gaji ${this.name} diubah menjadi $value")
            } else {
                println("Gaji tidak boleh negatif!")
            }
        }
}