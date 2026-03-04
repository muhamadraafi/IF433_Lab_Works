package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

class MathHelper {
    // Overloading: 3 fungsi dengan nama sama tapi parameter berbeda

    // 1. Menghitung luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // 2. Menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // 3. Menghitung luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}