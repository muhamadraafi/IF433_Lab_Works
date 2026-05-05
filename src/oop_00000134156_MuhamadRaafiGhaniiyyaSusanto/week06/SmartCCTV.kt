package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name aktif dan mulai merekam.")
        startRecord()  // Otomatis memanggil startRecord
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Merekam video ke cloud storage...")
    }
}