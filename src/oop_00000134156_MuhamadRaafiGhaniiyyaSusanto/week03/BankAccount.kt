package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class BankAccount(val accountNumber: String, initialBalance: Int) {
    var balance: Int = initialBalance
        private set  // Setter dibuat private!

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            println("Berhasil deposit $amount. Saldo sekarang: $balance")
        } else {
            println("Jumlah deposit harus positif!")
        }
    }

    fun withdraw(amount: Int) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Berhasil tarik tunai $amount. Saldo sekarang: $balance")
        } else if (amount > balance) {
            println("Saldo tidak cukup!")
        } else {
            println("Jumlah tarik tunai harus positif!")
        }
    }
}