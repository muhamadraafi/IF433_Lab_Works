package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name. Gunakan requireNotNull dengan pesan error custom
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
}