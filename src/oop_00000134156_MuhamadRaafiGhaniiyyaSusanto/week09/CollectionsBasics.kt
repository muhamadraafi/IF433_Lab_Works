package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week09

fun main() {
    println("=== TEST LIST IMMUTABLE VS MUTABLE ===")

    // Immutable List (Read-Only)
    val readOnlyList = listOf("Apple", "Banana", "Cherry")
    println("Read-Only List: $readOnlyList")

    // Mutable List (Bisa diubah)
    val mutableList = mutableListOf("Apple", "Banana", "Cherry")
    mutableList.add("Durian")
    mutableList.remove("Banana")
    println("Mutable List after changes: $mutableList")
}