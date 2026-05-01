package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("WARNING: Jumlah XP harus positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        println("$username mendapatkan $amount XP! Total XP: $xp")

        if (newLevel > oldLevel) {
            println("🎉 LEVEL UP! Selamat $username naik ke level $newLevel 🎉")
        }
    }

    fun getCurrentXp(): Int {
        return xp
    }
}