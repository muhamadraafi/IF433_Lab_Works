package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
            } else if (value > 1000) {
                println("WARNING: Damage terlalu tinggi! Dipaksa menjadi 1000.")
                field = 1000
            } else {
                field = value
                println("Damage $name berhasil diupdate menjadi $field")
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}