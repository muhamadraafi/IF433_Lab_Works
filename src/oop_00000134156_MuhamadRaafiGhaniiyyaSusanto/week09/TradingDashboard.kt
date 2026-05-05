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
    println("Closed trades: ${closedTrades.size}")
}