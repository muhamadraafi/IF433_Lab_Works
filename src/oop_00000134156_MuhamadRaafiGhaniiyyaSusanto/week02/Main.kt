package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== PENDAFTARAN MAHASISWA BARU ===")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    // Validasi panjang NIM sebelum membuat objek
    if (nim.length != 5) {
        println("ERROR: NIM harus 5 karakter! Pendaftaran dibatalkan.")
        return
    }

    println("\nPilih Jalur Pendaftaran:")
    println("1. Reguler (dengan Jurusan)")
    println("2. Umum (tanpa Jurusan)")
    print("Pilihan Anda (1/2): ")
    val choice = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Memanggil Primary Constructor dengan named argument untuk major
        val student = Student(name, nim, major = major)
        println("\n=== DATA MAHASISWA REGULER ===")
        println("Nama: ${student.name}")
        println("NIM: ${student.nim}")
        println("Jurusan: ${student.major}")
        println("GPA Awal: ${student.gpa}")

    } else if (choice == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
        val student = Student(name, nim)
        println("\n=== DATA MAHASISWA JALUR UMUM ===")
        println("Nama: ${student.name}")
        println("NIM: ${student.nim}")
        println("Jurusan: ${student.major}")
        println("GPA Awal: ${student.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    // Menjalankan sistem peminjaman buku
    println("\n" + "=".repeat(50))
    loanSystem()

    // Menjalankan RPG Game
    println("\n" + "=".repeat(50))
    rpgGame()
}

/**
 * Fungsi untuk sistem peminjaman buku
 */
fun loanSystem() {
    val scanner = Scanner(System.`in`)

    println("\n=== SISTEM PEMINJAMAN BUKU PERPUSTAKAAN ===")
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: lama pinjam tidak boleh minus
    if (duration < 0) {
        println("PERINGATAN: Lama pinjam tidak valid! Diubah menjadi 1 hari.")
        duration = 1
    }

    // Membuat objek Loan
    val loan = Loan(title, borrower, duration)

    // Print detail peminjaman dan Total Denda
    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}

/**
 * Fungsi untuk Mini RPG Battle
 * Alur Program:
 * 1. Input nama Hero & stat Damage. Buat objeknya.
 * 2. Musuh (Enemy) tidak perlu dibuat class, cukup variabel bantuan (var enemyHp = 100)
 * 3. Loop while (selama Hero hidup isAlive() DAN enemyHp > 0)
 * 4. Tampilkan Menu: 1. Serang, 2. Kabur
 * 5. Jika serang, kurangi enemyHp, musuh membalas dengan random damage 10-20
 * 6. Jika kabur, break loop
 * 7. Umumkan siapa yang menang
 */
fun rpgGame() {
    val scanner = Scanner(System.`in`)

    println("\n=== MINI RPG BATTLE ===")

    // 1. Input nama Hero & stat Damage
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine() // Consume newline

    // Buat objek Hero (HP otomatis 100 dari default argument)
    val hero = Hero(heroName, baseDamage = baseDamage)

    // 2. Musuh sebagai variabel sederhana
    var enemyHp = 100
    val enemyName = "Goblin"

    println("\n=== PERTEMPURAN DIMULAI ===")
    println("$heroName (HP: ${hero.hp}) VS $enemyName (HP: $enemyHp)")

    // 3. Game loop
    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- Giliran Hero ---")
        // 4. Tampilkan Menu
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi (1/2): ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                println("HP $enemyName sekarang: $enemyHp")

                // Cek apakah musuh masih hidup
                if (enemyHp > 0) {
                    println("\n--- Giliran Musuh ---")
                    // Musuh membalas dengan random damage antara 10 sampai 20
                    val enemyDamage = (10..20).random()
                    println("💢 $enemyName menyerang balik!")
                    hero.takeDamage(enemyDamage)
                }
            }
            2 -> {
                println("🏃 $heroName kabur dari pertempuran! Pengecut!")
                break
            }
            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    // 7. Umumkan siapa yang menang
    println("\n=== PERTEMPURAN SELESAI ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("🎉 $heroName MENANG! Musuh telah dikalahkan!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("💀 $heroName KALAH! Hero telah gugur dalam pertempuran.")
    } else if (!hero.isAlive() && enemyHp <= 0) {
        println("⚔️ Kedua pihak gugur bersama-sama! Seri!")
    } else {
        println("🏁 Pertempuran berakhir karena hero kabur.")
    }
}