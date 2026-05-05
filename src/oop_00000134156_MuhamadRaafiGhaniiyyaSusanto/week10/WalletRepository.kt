package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

    // Mencari item berdasarkan nama (khusus untuk Coin dan Transaction)
    fun findByName(name: String): T? {
        return items.find {
            when (it) {
                is Coin -> it.name.equals(name, ignoreCase = true)
                is Transaction -> it.id.equals(name, ignoreCase = true)
                else -> null
            } == true
        }
    }
}