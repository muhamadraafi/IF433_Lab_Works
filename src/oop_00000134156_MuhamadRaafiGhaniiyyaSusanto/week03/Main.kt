package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

fun main() {
    println("=== TEST EMPLOYEE ===")
    val e = Employee("Budi")
    e.salary = 5000
    e.setPerformanceRating(4)
    println("Rating kinerja: ${e.getPerformanceRating()}")

    println("\n=== TEST BANK ACCOUNT ===")
    val account = BankAccount("123-456-789", 1000)
    println("Saldo awal: ${account.balance}")

    account.deposit(500)
    account.withdraw(200)

    // Test validasi
    try {
        account.deposit(-100)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    try {
        account.withdraw(2000)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}