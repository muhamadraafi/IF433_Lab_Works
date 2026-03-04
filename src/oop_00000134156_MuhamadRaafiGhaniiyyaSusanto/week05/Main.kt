package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

fun main() {
    // === GUIDED LAB: Polymorphic Collection & Smart Casting ===
    println("=== DEMO POLYMORPHIC COLLECTION & SMART CASTING ===\n")

    // Membuat polymorphic collection
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Budi Santoso", "1234567890"),
        Admin("Siti Aminah")
    )

    // Memproses setiap pegawai dengan smart casting
    for (pegawai in daftarPegawai) {
        println("Memproses: ${pegawai.nama}")

        // Memanggil method polymorphic
        pegawai.bekerja()

        // Smart Casting dengan is dan when
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

    // === TUGAS MANDIRI 1: METHOD OVERLOADING ===
    println("\n=== TUGAS MANDIRI 1: METHOD OVERLOADING ===\n")

    // Instansiasi MathHelper
    val mathHelper = MathHelper()

    // Memanggil fungsi hitungLuas dengan berbagai parameter (OVERLOADING)
    // 1. Memanggil hitungLuas dengan 1 parameter Int -> luas persegi
    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi dengan sisi 5: $luasPersegi")

    // 2. Memanggil hitungLuas dengan 2 parameter Int -> luas persegi panjang
    val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
    println("Luas persegi panjang 4 x 6: $luasPersegiPanjang")

    // 3. Memanggil hitungLuas dengan 1 parameter Double -> luas lingkaran
    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran dengan jari-jari 7: $luasLingkaran")

    // === TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===
    println("\n=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===\n")

    // MEMBUAT OBJEK PEMBAYARAN
    // 1. Membuat objek EWallet dengan saldo awal Rp 50.000
    val eWallet = EWallet("Budi's E-Wallet", 50000.0)

    // 2. Membuat objek CreditCard dengan limit Rp 100.000
    val creditCard = CreditCard("Budi's Credit Card", 100000.0)

    // MEMBUAT POLYMORPHIC COLLECTION
    // Memasukkan kedua objek ke dalam list bertipe PaymentMethod (abstract class)
    val metodePembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    // PERCOBAAN PEMBAYARAN PERTAMA (Rp 75.000)
    println("--- Percobaan Pembayaran Pertama (Rp 75.000) ---")

    // Melakukan perulangan untuk setiap metode pembayaran
    for (metode in metodePembayaran) {
        println("\nMetode: ${metode.accountName}")

        // Memanggil method polymorphic processPayment
        // Akan menjalankan versi override masing-masing class:
        // - EWallet: akan mengecek saldo
        // - CreditCard: akan mengecek limit
        metode.processPayment(75000.0)
    }

    // === SMART CASTING CHALLENGE ===
    println("\n--- SMART CASTING CHALLENGE: Top Up E-Wallet ---")

    // Melakukan perulangan lagi untuk mendeteksi tiap metode dengan SMART CASTING
    for (metode in metodePembayaran) {
        when (metode) {
            // SMART CASTING: Ketika terdeteksi sebagai EWallet
            is EWallet -> {
                println("\n✅ Mendeteksi E-Wallet: ${metode.accountName}")
                println("   Saldo sebelum top up: Rp ${metode.balance}")

                // Memanggil fungsi spesifik EWallet (topUp)
                // Ini bisa dilakukan karena smart casting sudah mengubah tipe menjadi EWallet
                metode.topUp(50000.0)

                println("   Mencoba pembayaran Rp 75.000 lagi setelah top up:")
                // Mencoba pembayaran lagi setelah top up
                metode.processPayment(75000.0)
            }

            // SMART CASTING: Ketika terdeteksi sebagai CreditCard
            is CreditCard -> {
                println("\n💳 Mendeteksi Credit Card: ${metode.accountName}")
                println("   Status kartu kredit - Limit: Rp ${metode.limit}, Terpakai: Rp ${metode.usedAmount}")
                println("   (Tidak dilakukan top up karena bukan E-Wallet)")
            }

            // Jika ada metode pembayaran lain di masa depan, bisa ditambahkan di sini
        }
    }

    // === RINGKASAN AKHIR ===
    println("\n" + "=".repeat(40))
    println("RINGKASAN TRANSAKSI")
    println("=".repeat(40))

    // Menampilkan status akhir EWallet
    println("\nStatus Akhir E-Wallet:")
    println("   Pemilik: ${eWallet.accountName}")
    println("   Saldo akhir: Rp ${eWallet.balance}")

    // Menampilkan status akhir CreditCard
    println("\nStatus Akhir Credit Card:")
    println("   Pemilik: ${creditCard.accountName}")
    println("   Limit: Rp ${creditCard.limit}")
    println("   Total terpakai: Rp ${creditCard.usedAmount}")
    println("   Sisa limit: Rp ${creditCard.limit - creditCard.usedAmount}")

    println("\n=== PROGRAM SELESAI ===")
}
