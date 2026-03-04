package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran sebesar Rp $amount berhasil. Sisa saldo: Rp $balance")
        } else {
            println("[$accountName] Saldo tidak cukup! Saldo: Rp $balance, diperlukan: Rp $amount")
        }
    }

    // Fungsi spesifik untuk top up saldo
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sebesar Rp $amount berhasil. Saldo sekarang: Rp $balance")
    }
}