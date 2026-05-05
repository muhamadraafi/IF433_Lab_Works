package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as? String
            ?: throw IllegalArgumentException("API Invalid: ID must be String")

        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as? String
            ?: throw IllegalArgumentException("API Invalid: Name must be String")

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val transactionId = when (product) {
            is Product.Electronic -> {
                val result = JavaPaymentService.processPayment(product.id)
                result!!
            }
            is Product.Clothing -> {
                val result = JavaPaymentService.processPayment(product.id)
                result!!
            }
        }
        println("✅ Transaksi sukses! Transaction ID: $transactionId")
    }
}