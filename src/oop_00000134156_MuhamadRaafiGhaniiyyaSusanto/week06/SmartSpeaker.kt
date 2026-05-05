package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name siap mendengar perintah 'Hey Google'.")
    }

    override fun turnOff() {
        println("Speaker $name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}