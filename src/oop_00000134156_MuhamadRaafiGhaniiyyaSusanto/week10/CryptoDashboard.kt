package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Response status: ${response.status}")

    println("\n=== COIN HOLDINGS ===")
    response.data.forEach { coin ->
        println("  • ${coin.name}: ${coin.balance}")
    }
}