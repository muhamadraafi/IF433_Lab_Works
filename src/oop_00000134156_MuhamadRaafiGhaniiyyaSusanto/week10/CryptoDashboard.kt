package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    val coinRepo = WalletRepository<Coin>()

    // Menambah minimal 3 koin
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1000.0))

    println("Coins added to repository!")
}