package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

fun main() {
    // Membuat polymorphic collection (List of Pegawai)
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Prof. Ahmad", "12345"),
        Admin("Siti"),
        Dosen("Dr. Budi", "67890"),
        Admin("Joko")
    )

    // Menampilkan semua pegawai dan melakukan smart casting
    for (pegawai in daftarPegawai) {
        println("Pegawai: ${pegawai.nama}")
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------")
    }
}