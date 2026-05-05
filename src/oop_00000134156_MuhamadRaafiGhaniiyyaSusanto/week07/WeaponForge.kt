package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Excalibur", 150, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}