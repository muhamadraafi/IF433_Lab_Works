package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, userName: String?) {
    println("Judul: $title")
    println("Harga Akhir: $finalPrice")
    // Elvis Operator sesuai modul
    println("Catatan User: ${userName ?: "Tidak ada catatan"}")
}

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val finalPrice = calculateDiscount(price)
    val userName: String? = null  // Challenge null safety

    // Named Arguments
    printReceipt(title = gameTitle, finalPrice = finalPrice, userName = userName)
}