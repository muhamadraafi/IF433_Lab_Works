package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

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
}