package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    // ===== GUIDED LAB CODE =====
    val emp = Employee("Budi")

    println("=== Testing Setter Gaji ===")
    emp.salary = 5000
    println("Gaji sekarang: ${emp.salary}")

    emp.salary = -1000
    println("Gaji sekarang: ${emp.salary}")

    println("\n=== Testing Performance Rating ===")
    emp.updatePerformanceRating(4)
    emp.updatePerformanceRating(6)

    println("\n=== Testing Balance & Tax ===")
    emp.balance = 1000000
    println("Pajak: ${emp.taxBalance}")
    emp.balance = -5000

    // ===== TASK 1: WEAPON TESTING =====
    println("\n========== TUGAS 1: WEAPON ==========")
    val weapon = Weapon("Excalibur")

    println("\n1. Mencoba set damage -50 (harus ditolak):")
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}, Tier: ${weapon.tier}")

    println("\n2. Mencoba set damage 9999 (harus dipaksa jadi 1000):")
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}, Tier: ${weapon.tier}")

    println("\n3. Mencoba set damage 700 (Epic):")
    weapon.damage = 700
    println("Damage sekarang: ${weapon.damage}, Tier: ${weapon.tier}")

    println("\n4. Mencoba set damage 900 (Legendary):")
    weapon.damage = 900
    println("Damage sekarang: ${weapon.damage}, Tier: ${weapon.tier}")
}