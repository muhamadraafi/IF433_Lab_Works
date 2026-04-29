package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val finalPrice = price - calculateDiscount(price)

    println("Game: $gameTitle")
    println("Harga Asli: Rp$price")
    println("Harga Akhir: Rp$finalPrice")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()