package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus positif!")
            return
        }

        val levelBefore = level
        xp += amount
        val levelAfter = level

        println("$username mendapat $amount XP. Total XP: $xp")

        if (levelAfter > levelBefore) {
            println("LEVEL UP! Selamat $username naik ke level $levelAfter")
        }
    }

    fun getXp(): Int {
        return xp
    }
}