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

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(name, nim, major)
    println("Mahasiswa ${student.name} dengan NIM ${student.nim} jurusan ${student.major} berhasil didaftarkan.")
}