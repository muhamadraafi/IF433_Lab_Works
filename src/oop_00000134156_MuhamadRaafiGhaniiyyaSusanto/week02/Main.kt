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
}