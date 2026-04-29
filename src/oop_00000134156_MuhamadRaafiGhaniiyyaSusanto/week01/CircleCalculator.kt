package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Luas lingkaran dengan radius $radius adalah $area")

    if (area > 100) {
        println("Lingkaran Besar")
    } else {
        println("Lingkaran Kecil")
    }
}