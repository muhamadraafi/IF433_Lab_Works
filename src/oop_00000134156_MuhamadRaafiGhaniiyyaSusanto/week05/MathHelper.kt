package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

class MathHelper {
    // Overloading 1: Luas Persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Overloading 2: Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Overloading 3: Luas Lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}