package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("⚔️ Monster muncul: ${event.monsterName}! Bersiaplah bertarung!")
        }
        is BattleState.LootDropped -> {
            println("🎁 Loot ditemukan: ${event.item.name} (Damage: ${event.item.damage}, Rarity: ${event.item.rarity})")
            println("   Drop Chance ${event.item.rarity.name} : ${event.item.rarity.dropChance}%")
        }
        is BattleState.GameOver -> {
            println("💀 GAME OVER - Reason: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("🛡️ Anda berada di Safe Zone. Tidak ada musuh di sekitar.")
        }
    }
}