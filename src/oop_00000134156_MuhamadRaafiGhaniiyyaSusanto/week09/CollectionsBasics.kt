package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week09

fun main() {
    println("=== TEST LIST IMMUTABLE VS MUTABLE ===")

    val readOnlyList = listOf("Apple", "Banana", "Cherry")
    println("Read-Only List: $readOnlyList")

    val mutableList = mutableListOf("Apple", "Banana", "Cherry")
    mutableList.add("Durian")
    mutableList.remove("Banana")
    println("Mutable List after changes: $mutableList")

    println("\n=== TEST SET (UNIQUE ELEMENTS) ===")
    val duplicateList = listOf("BTC", "ETH", "BTC", "SOL", "ETH", "XRP")
    println("Original list with duplicates: $duplicateList")

    val uniqueSet = duplicateList.toSet()
    println("Set after removing duplicates: $uniqueSet")
}