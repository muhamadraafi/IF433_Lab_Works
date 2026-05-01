package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Rp$amount berhasil menggunakan Credit Card. Total terpakai: Rp$usedAmount dari limit Rp$limit")
        } else {
            println("[$accountName] Transaksi ditolak! Melebihi limit. Limit tersisa: Rp${limit - usedAmount}")
        }
    }
}