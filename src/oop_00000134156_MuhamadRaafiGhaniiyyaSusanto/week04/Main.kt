package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()       // Memanggil method milik sendiri
    myCar.honk()            // Memanggil method yang sudah di-override
    myCar.accelerate()      // Memanggil gabungan method Parent dan Child

    println("\n--- Testing ElectricCar (Tugas 1) ---")
    val tesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    tesla.openTrunk()       // Method dari Car
    tesla.honk()            // Method override dari Car
    tesla.accelerate()      // Method final override dari ElectricCar
}