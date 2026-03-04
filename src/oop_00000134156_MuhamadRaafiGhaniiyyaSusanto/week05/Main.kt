package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

fun main() {
    // Coba buat objek Pegawai langsung (ini akan error - coba buktikan)
    // val p = Pegawai("Test") // INI AKAN ERROR - coba uncomment untuk melihat error

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
}