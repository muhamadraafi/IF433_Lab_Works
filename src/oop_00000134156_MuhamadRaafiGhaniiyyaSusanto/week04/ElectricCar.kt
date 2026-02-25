package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

// ElectricCar adalah Child dari Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int)
    : Car(brand, numberOfDoors) {

    // final override agar tidak bisa di-override lagi oleh turunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

    // Kita tidak perlu meng-override honk() karena akan menggunakan versi dari Car
    // yang sudah mencetak "TIN TIN! Mobil $brand lewat!"
}