package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}