package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

fun sendNotification(contact: String?) {
    if (contact != null) {
        // Smart cast: contact otomatis menjadi non-null di sini
        println("Mengirim notifikasi ke: ${contact.uppercase()}")
    } else {
        println("Tidak dapat mengirim notifikasi: kontak tidak tersedia")
    }
}