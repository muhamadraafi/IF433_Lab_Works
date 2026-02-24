package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week03

class BankAccount(val accountNumber: String, initialBalance: Int) {
    var balance: Int = initialBalance
        private set

    init {
        // Validasi di constructor
        require(initialBalance >= 0) { "Saldo awal tidak boleh negatif!" }
        println("Akun $accountNumber dibuat dengan saldo $balance")
    }

    fun deposit(amount: Int) {
        require(amount > 0) { "Jumlah deposit harus positif!" }
        balance += amount
        println("Berhasil deposit $amount. Saldo sekarang: $balance")
    }

    fun withdraw(amount: Int) {
        require(amount > 0) { "Jumlah tarik tunai harus positif!" }
        require(amount <= balance) { "Saldo tidak cukup!" }

        balance -= amount
        println("Berhasil tarik tunai $amount. Saldo sekarang: $balance")
    }
}