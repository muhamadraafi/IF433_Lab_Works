package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} telah ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA PERANGKAT ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n=== MODUS KEAMANAN AKTIF ===")
        for (device in devices) {
            when {
                device is Recordable -> {
                    device.startRecord()
                }
                device is SmartSpeaker -> {
                    device.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}