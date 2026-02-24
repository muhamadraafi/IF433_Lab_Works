package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("PERINGATAN: Damage tidak boleh negatif! Nilai tetap ${field}")
                // Tidak mengubah field
            } else if (value > 1000) {
                field = 1000
                println("Damage terlalu tinggi (>1000), dipaksa menjadi 1000")
            } else {
                field = value
                println("Damage $name diubah menjadi $value")
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}