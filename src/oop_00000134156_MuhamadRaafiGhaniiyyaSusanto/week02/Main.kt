package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // ===== GUIDED LAB CODE =====
    print("Masukkan Nama Mahasiswa: ")
    val name = scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("NIM tidak valid! Panjang NIM harus 5 digit.")
        println("Pendaftaran dibatalkan.")
        return
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    // ===== TASK 1: LIBRARY FINE SYSTEM =====
    println("\n========== SISTEM PEMINJAMAN BUKU ==========")
    scanner.nextLine()

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        println("Lama pinjam tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)
    println("\n========== DETAIL PEMINJAMAN ==========")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp${loan.calculateFine()}")

    // ===== TASK 2: MINI RPG BATTLE =====
    println("\n========== MINI RPG BATTLE ==========")
    scanner.nextLine()

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100
    val enemyName = "Goblin"

    println("\n✨ ${hero.name} memasuki arena pertempuran! ✨")
    println("👾 Musuh: $enemyName dengan HP $enemyHp 👾")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n========== MENU PERTEMPURAN ==========")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Hero menyerang
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("👾 HP $enemyName tersisa: $enemyHp 👾")

                // Musuh membalas jika masih hidup
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("👾 $enemyName menyerang balik! 👾")
                    hero.takeDamage(enemyDamage)
                }
            }
            2 -> {
                println("🏃‍♂️ ${hero.name} melarikan diri dari pertempuran! 🏃‍♂️")
                break
            }
            else -> {
                println("Pilihan tidak valid! Silakan coba lagi.")
            }
        }
    }

    // Hasil pertempuran
    println("\n========== HASIL PERTEMPURAN ==========")
    if (!hero.isAlive()) {
        println("💀 ${hero.name} telah gugur! 💀")
        println("👾 $enemyName menang! 👾")
    } else if (enemyHp <= 0) {
        println("🎉 ${hero.name} memenangkan pertempuran! 🎉")
        println("👾 $enemyName telah dikalahkan! 👾")
    } else {
        println("🏃‍♂️ Pertempuran dihindari. ${hero.name} melarikan diri! 🏃‍♂️")
    }
}