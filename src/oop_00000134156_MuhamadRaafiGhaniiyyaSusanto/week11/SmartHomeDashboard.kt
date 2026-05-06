package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week11

fun main() {
    println("=== SMART HOME CONFIGURATION PIPELINE ===")

    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Pencahayaan
    val livingRoomLamp = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).also {
        homeDevices.add(it)
    }
    println("Configured: ${livingRoomLamp.name}")

    // Konfigurasi Keamanan
    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }.also {
        homeDevices.add(it)
    }

    // Alat pakan peliharaan
    val petFeeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10).also {
        homeDevices.add(it)
    }

    println("\n=== DEVICE SEARCH WITH LET ===")
    // Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let { device ->
        println("Device found: ${device.diagnose()}")
    }
}