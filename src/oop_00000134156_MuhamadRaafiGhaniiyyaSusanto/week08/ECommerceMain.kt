package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

fun main() {
    println("========== E-COMMERCE API PARSER ==========")
    println("========== WEEK 08 - FINAL TEST ==========")

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("\n--- Processing API Data ---")
    for ((index, raw) in rawApiData.withIndex()) {
        println("\n[Data ke-${index + 1}]")
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("📦 Product parsed: ${it}")
                parser.checkout(it)
            } ?: println("⚠️ Unknown product type, skipping...")
        } catch (e: IllegalArgumentException) {
            println("❌ Data korup: ${e.message}")
        }
    }

    println("\n========== PIPELINE TEST COMPLETED ==========")
    println("✅ Full e-commerce pipeline test successful!")
}