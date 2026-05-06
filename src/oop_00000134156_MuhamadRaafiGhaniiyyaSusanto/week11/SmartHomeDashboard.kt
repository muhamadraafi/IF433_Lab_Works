package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week11

fun main() {
    println("=== SMART HOME CONFIGURATION PIPELINE ===")

    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Pencahayaan (apply & also)
    val livingRoomLamp = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).also {
        homeDevices.add(it)
    }

    println("Configured: ${livingRoomLamp.name}")
}