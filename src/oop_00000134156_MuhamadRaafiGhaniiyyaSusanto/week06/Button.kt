package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '${name}' berhasil diklik!")
    }
}