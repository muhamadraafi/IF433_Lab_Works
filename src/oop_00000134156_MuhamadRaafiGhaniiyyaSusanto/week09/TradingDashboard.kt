package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week09

fun main() {
    println("=== CRYPTO TRADING DASHBOARD ===")

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 25.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 5, -12.3, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 45.8, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 8, 8.2, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 10, 15.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -5.5, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 12, 30.1, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe < 0 }

    val winRate = (winningTrades.size.toDouble() / closedTrades.size) * 100

    val totalProfit = winningTrades.sumOf { it.roe }
    val totalLoss = losingTrades.sumOf { it.roe }
    val netProfit = totalProfit + totalLoss
    val averageProfit = if (winningTrades.isNotEmpty()) totalProfit / winningTrades.size else 0.0

    val uniquePairs = winningTrades.map { it.pair }.toSet().sorted()
    val topPerformers = winningTrades
        .sortedByDescending { it.roe }
        .take(3)

    val topPerformersString = topPerformers.map { "${it.pair} : ${it.roe}%" }
    val worstPerformers = losingTrades
        .sortedBy { it.roe }
        .take(3)

    val worstPerformersString = worstPerformers.map { "${it.pair} : ${it.roe}%" }

    println("\n=== METRICS ===")
    println("Closed trades: ${closedTrades.size}")
    println("Winning trades: ${winningTrades.size}")
    println("Losing trades: ${losingTrades.size}")
    println("Win Rate: %.2f%%".format(winRate))
    println("Total Profit: %.2f%%".format(totalProfit))
    println("Total Loss: %.2f%%".format(totalLoss))
    println("Net Profit: %.2f%%".format(netProfit))
    println("Average Profit: %.2f%%".format(averageProfit))

    println("\n=== TOP 3 PERFORMERS ===")
    topPerformersString.forEach { println("  🟢 $it") }
}