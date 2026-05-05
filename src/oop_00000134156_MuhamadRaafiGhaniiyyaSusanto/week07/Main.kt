package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // ========== TUGAS MANDIRI ==========
    println("\n" + "=".repeat(50))
    println("🎮 TUGAS MANDIRI - RPG GAME 🎮")
    println("=".repeat(50))

    println("\n--- GameManager Singleton Test ---")
    GameManager.startGame()
    GameManager.startGame()

    println("\n--- Item Rarity Drop Chance ---")
    println("Legendary item drop chance: ${ItemRarity.LEGENDARY.dropChance}%")

    println("\n--- Weapon Forge Factory Test ---")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Starter Weapon: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}, Rarity: ${starterWeapon.item.rarity}")

    println("\n--- Immutability Test with copy() ---")
    val upgradedItem = starterWeapon.item.copy(name = "Pedang Kayu +1", damage = 25)
    println("Original item: ${starterWeapon.item}")
    println("Upgraded item (using copy): $upgradedItem")
    println("Original item unchanged: ${starterWeapon.item} (Immutability preserved!)")

    println("\n--- Battle Events Simulation ---")
    println("1. Safe Zone:")
    processEvent(BattleState.SafeZone)

    println("\n2. Monster Encounter:")
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    println("\n3. Loot Dropped (upgraded weapon):")
    processEvent(BattleState.LootDropped(upgradedItem))

    println("\n4. Game Over:")
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}