package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

// Manager mewarisi Employee
class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar (dari parent) ditambah Rp 500.000
        return super.calculateBonus() + 500000
    }
}