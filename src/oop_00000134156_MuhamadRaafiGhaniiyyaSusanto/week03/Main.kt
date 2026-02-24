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

    // Baris di bawah ini akan ERROR (coba hapus komentar)
    // account.balance = 5000  // ERROR: Cannot assign to 'balance'

    account.withdraw(2000)  // Akan gagal (saldo tidak cukup)
}