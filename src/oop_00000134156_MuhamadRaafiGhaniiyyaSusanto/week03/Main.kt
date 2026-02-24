package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    println("=== TEST EMPLOYEE ===")
    val e = Employee("Budi")
    e.salary = 5000
    e.setPerformanceRating(4)
    println("Rating kinerja: ${e.getPerformanceRating()}")

    println("\n=== TEST BANK ACCOUNT ===")
    val account = BankAccount("123-456-789", 1000)
    println("Saldo awal: ${account.balance}")
    account.deposit(500)
    account.withdraw(200)

    println("\n=== TEST WEAPON (TUGAS 1) ===")
    val weapon = Weapon("Excalibur")

    println("Mencoba set damage -50:")
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    println("\nMencoba set damage 9999:")
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    println("\nMencoba set damage 750:")
    weapon.damage = 750
    println("Damage sekarang: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    println("\nMencoba set damage 900:")
    weapon.damage = 900
    println("Damage sekarang: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}