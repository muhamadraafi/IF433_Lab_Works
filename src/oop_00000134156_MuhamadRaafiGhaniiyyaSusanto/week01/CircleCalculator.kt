package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main(args: Array<String>) {
    // Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    // Calculation
    var area: Double = pi * radius * radius

    // Output Concatenation
    println("Luas lingkaran dengan radius " + radius + " adalah " + area)

    if (area > 100) {
        println("Lingkaran Besar")
    } else {
        println("Lingkaran Kecil")
    }
}