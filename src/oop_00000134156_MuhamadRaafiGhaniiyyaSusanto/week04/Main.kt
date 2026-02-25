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

    println("\n--- Testing Employee Hierarchy (Tugas 2) ---")

    // Membuat objek Manager
    val manager = Manager(name = "Budi", baseSalary = 10000000)
    println("Manager: ${manager.name}")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    // Membuat objek Developer
    val developer = Developer(name = "Ani", baseSalary = 8000000, programmingLanguage = "Kotlin")
    println("Developer: ${developer.name}")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}