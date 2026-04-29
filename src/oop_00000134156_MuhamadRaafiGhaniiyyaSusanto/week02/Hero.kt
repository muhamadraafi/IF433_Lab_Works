package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("⚔️ $name menebas $targetName! ⚔️")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
        println("💔 $name menerima $damage damage! Sisa HP: $hp 💔")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}