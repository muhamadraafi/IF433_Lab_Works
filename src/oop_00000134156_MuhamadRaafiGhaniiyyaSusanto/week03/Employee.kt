package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Gaji tidak boleh negatif! Nilai tidak diubah.")
            } else {
                field = value  // Menggunakan backing field
                println("Gaji $name berhasil diupdate menjadi Rp$field")
            }
        }
}