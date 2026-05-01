package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

// Parent class Employee (harus open)
open class Employee(val name: String, val baseSalary: Int) {

    // Method open agar bisa di-override
    open fun work() {
        println("$name sedang bekerja.")
    }

    // Method open agar bisa di-override
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}