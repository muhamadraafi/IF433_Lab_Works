package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, originalPrice = price, discount = discount, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, discount: Int, finalPrice: Int) {
    println("========== STRUK PEMBELIAN ==========")
    println("Game: $title")
    println("Harga Asli: Rp$originalPrice")
    println("Diskon: Rp$discount")
    println("Harga Akhir: Rp$finalPrice")
    println("=====================================")
}