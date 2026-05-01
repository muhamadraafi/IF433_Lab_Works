package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week04

fun main() {
    // ===== GUIDED LAB =====
    println("========== GUIDED LAB ==========")
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    // ===== TASK 2: HIERARKI KARYAWAN =====
    println("\n========== TASK 2: HIERARKI KARYAWAN ==========")

    val manager = Manager(name = "Budi", baseSalary = 10000000)
    println("--- Manager ---")
    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    val developer = Developer(name = "Andi", baseSalary = 8000000, programmingLanguage = "Kotlin")
    println("\n--- Developer ---")
    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}