package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

class Student(
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,  // Default Argument - diletakkan sebelum major
    var major: String
) {
    // Secondary Constructor - otomatis mewarisi default value 0.0 untuk gpa
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}