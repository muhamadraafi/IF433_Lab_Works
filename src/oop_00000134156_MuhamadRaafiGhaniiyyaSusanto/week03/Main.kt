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

    println("\n=== TEST PLAYER (TUGAS 2) ===")
    val player = Player("Raafi")

    println("XP awal: ${player.getXp()}")
    println("Level awal: ${player.level}")

    // Baris di bawah ini akan ERROR jika dijalankan (coba hapus komentar)
    // println(player.xp)  // ERROR: Cannot access 'xp'

    println("\nTambah XP 50:")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    println("\nTambah XP 60:")
    player.addXp(60)
    println("Level sekarang: ${player.level}")

    println("\nTambah XP -10 (harus gagal):")
    player.addXp(-10)

    println("\nTambah XP 100:")
    player.addXp(100)
    println("Level sekarang: ${player.level}")

    println("\nXP akhir: ${player.getXp()}")
}