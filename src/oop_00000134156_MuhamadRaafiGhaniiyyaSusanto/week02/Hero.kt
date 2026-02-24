package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

/**
 * Spesifikasi Class Hero:
 * 1. Properties: name (String), hp (Int), baseDamage (Int)
 * 2. Constructor: name dan baseDamage diisi manual, hp default = 100
 * 3. Method:
 *    - attack(targetName: String): Print simulasi serangan
 *    - takeDamage(damage: Int): Kurangi hp, gunakan IF agar HP tidak minus
 *    - isAlive(): Return Boolean (True jika HP > 0)
 */
class Hero(
    val name: String,
    var hp: Int = 100,  // Default Argument = 100
    val baseDamage: Int
) {
    fun attack(targetName: String) {
        println("💥 $name menebas $targetName! (Damage: $baseDamage)")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        // Logika Wajib: Gunakan IF agar HP tidak pernah tembus angka minus
        if (hp < 0) {
            hp = 0
        }
        println("💔 $name menerima serangan $damage damage! Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}