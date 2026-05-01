package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

fun main() {
    // ===== GUIDED LAB =====
    println("========== GUIDED LAB ==========")
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Prof. Ahmad", "12345"),
        Admin("Siti"),
        Dosen("Dr. Budi", "67890"),
        Admin("Joko")
    )

    for (pegawai in daftarPegawai) {
        println("Pegawai: ${pegawai.nama}")
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------")
    }

    // ===== TASK 1: OVERLOADING =====
    println("\n========== TASK 1: OVERLOADING ==========")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(4, 7)
    println("Luas Persegi Panjang (panjang=4, lebar=7): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari=7): $luasLingkaran")

    // ===== TASK 2: PAYMENT SYSTEM =====
    println("\n========== TASK 2: PAYMENT SYSTEM ==========")

    val eWallet = EWallet("Budi", 50000.0)
    val creditCard = CreditCard("Andi", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== Percobaan pembayaran pertama Rp75.000 ===")
    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }

    // Smart Casting Challenge: Top up EWallet jika saldo tidak cukup
    println("\n=== Smart Casting: Deteksi EWallet dan Top Up ===")
    for (method in paymentMethods) {
        when (method) {
            is EWallet -> {
                println("Smart Casting terdeteksi: ${method.accountName} menggunakan EWallet!")
                println("Menjalankan top up Rp50.000 untuk recovery...")
                method.topUp(50000.0)
                println("Mencoba pembayaran lagi Rp75.000...")
                method.processPayment(75000.0)
            }
            else -> {
                println("${method.accountName} menggunakan metode lain, tidak perlu top up.")
            }
        }
    }
}