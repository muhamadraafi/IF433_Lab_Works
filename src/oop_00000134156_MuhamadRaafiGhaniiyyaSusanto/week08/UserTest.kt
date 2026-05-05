package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

fun runMockUnitTest() {
    println("\n=== MOCK UNIT TEST ===")

    // Simulasi data dari database
    val mockDatabaseResult: Map<String, String?> = mapOf(
        "user_1" to "Budi",
        "user_2" to null  // Data corrupt!
    )

    // Ini adalah TEST. Kita ingin CRASH jika data tidak sesuai ekspektasi.
    val userName = mockDatabaseResult["user_2"]!!
    println("User name: $userName") // Baris ini tidak akan tercapai jika user_2 adalah null
}

fun runMockUnitTestSafe() {
    println("\n=== MOCK UNIT TEST (Dengan Assert) ===")

    val mockDatabaseResult: Map<String, String?> = mapOf(
        "user_1" to "Budi",
        "user_2" to null
    )

    // Alternatif yang lebih baik untuk testing: gunakan requireNotNull dengan pesan
    val userName = requireNotNull(mockDatabaseResult["user_2"]) {
        "TEST FAILED: User_2 seharusnya tidak null di database!"
    }
    println("User name: $userName")
}