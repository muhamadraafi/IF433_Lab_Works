package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    // Coin Repository
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

    // Transaction Repository
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TXN001", 500.0))
    txRepo.add(Transaction("TXN002", 250.0))
    txRepo.add(Transaction("TXN003", 100.0))

    println("\n=== TRANSACTION HISTORY ===")
    txRepo.getAll().forEach { tx ->
        println("  • ID: ${tx.id} - Amount: ${tx.amount}")
    }
}