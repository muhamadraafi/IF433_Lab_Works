package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: $this")
        // Gunakan ?: Elvis operator untuk menangani jika length null
        (length ?: 0) * 2
    }
    println("Hasil kalkulasi run: $result")
}