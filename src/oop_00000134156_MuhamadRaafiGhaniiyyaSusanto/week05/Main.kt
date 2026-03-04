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

    // Catatan: Program akan berhenti di sini dulu karena Tugas Mandiri 2 belum ditambahkan
    // Nanti di CHECKPOINT 10 dan 11 kita akan tambahkan kode untuk Tugas Mandiri 2
}
