package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

// ElectricCar adalah Child dari Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    // Tambahkan keyword final sebelum override fun accelerate
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}