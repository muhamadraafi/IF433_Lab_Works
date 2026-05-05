package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name menyala dengan cahaya hangat 3000K.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}