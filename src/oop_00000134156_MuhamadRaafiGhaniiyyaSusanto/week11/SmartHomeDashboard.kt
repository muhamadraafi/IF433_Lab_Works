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

    // Konfigurasi Keamanan (also)
    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}