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

    // ===== TASK 2: PLAYER LEVELING TESTING =====
    println("\n========== TUGAS 2: PLAYER ==========")
    val player = Player("HeroBima")
    println("Player: ${player.username}")
    println("Level awal: ${player.level}")

    println("\n1. Mencoba akses player.xp (seharusnya ERROR jika di luar class):")
    println("   (Kode tidak bisa mengakses xp karena private)")

    println("\n2. Mencoba menambah XP 50 (masih Level 1):")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    println("\n3. Mencoba menambah XP 60 (total 110, harus Level Up ke 2):")
    player.addXp(60)
    println("Level sekarang: ${player.level}")

    println("\n4. Mencoba menambah XP -10 (harus ditolak):")
    player.addXp(-10)

    println("\n5. Mencoba menambah XP 100 (Level 3):")
    player.addXp(100)
    println("Level sekarang: ${player.level}")
}