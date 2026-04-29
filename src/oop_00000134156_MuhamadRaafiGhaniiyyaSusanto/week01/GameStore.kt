package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userName: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        discount = discount,
        finalPrice = finalPrice,
        userNote = userName?.let { "Catatan untuk $it" } ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, discount: Int, finalPrice: Int, userNote: String) {
    println("========== STRUK PEMBELIAN ==========")
    println("Game: $title")
    println("Harga Asli: Rp$originalPrice")
    println("Diskon: Rp$discount")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan: $userNote")
    println("=====================================")
}