package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week08

// name adalah Non-Null (wajib), email dan phone adalah Nullable (opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)