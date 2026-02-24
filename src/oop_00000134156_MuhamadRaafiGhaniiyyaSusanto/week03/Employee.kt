package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Setter dipanggil dengan nilai: $value")
            this.salary = value  // INI SALAH! Akan menyebabkan rekursi tak terbatas
        }
}