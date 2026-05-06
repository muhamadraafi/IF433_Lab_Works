package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week11

fun main() {
    println("=== SMART HOME CONFIGURATION PIPELINE ===")

    val homeDevices = mutableListOf<SmartDevice>()

    // 1. Konfigurasi Pencahayaan (apply & also)
    val livingRoomLamp = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).also {
        homeDevices.add(it)
        println("✓ Added: ${it.name}")
    }

    // 2. Konfigurasi Keamanan (also)
    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
        println("✓ Added: ${it.name}")
    }

    // 3. Konfigurasi AC (run)
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }.also {
        homeDevices.add(it)
        println("✓ Added: ${it.name}")
    }

    // 4. Alat pakan peliharaan
    val petFeeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10).also {
        homeDevices.add(it)
        println("✓ Added: ${it.name}")
    }

    // 5. Pencarian Aman dengan let
    println("\n=== DEVICE SEARCH ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let { device ->
        println("✅ Camera found!")
        println(device.diagnose())
    }

    // 6. Menggunakan with untuk Format Summary
    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total devices: ${this.size}")
        println("Device categories: ${this.map { it.category }.distinct()}")
    }

    // 7. Kalkulasi Daya dengan run
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total power usage: $totalPower Watts")

    // 8. Diagnostik semua perangkat
    println("\n=== DEVICE DIAGNOSTICS ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }

    println("\n========== PIPELINE TEST COMPLETED ==========")
    println("✅ Full smart home configuration pipeline test successful!")
}