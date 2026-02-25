package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Override method honk dari parent
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}