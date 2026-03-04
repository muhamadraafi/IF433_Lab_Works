package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            val sisaLimit = limit - usedAmount
            println("[$accountName] Pembayaran sebesar Rp $amount berhasil. Sisa limit: Rp $sisaLimit")
        } else {
            println("[$accountName] Transaksi ditolak! Melebihi limit kartu kredit.")
            println("        Limit: Rp $limit, sudah terpakai: Rp $usedAmount, sisa: Rp ${limit - usedAmount}")
        }
    }
}