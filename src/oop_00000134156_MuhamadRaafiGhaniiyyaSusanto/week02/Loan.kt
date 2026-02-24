package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week02

/**
 * Spesifikasi Class Loan:
 * 1. Properties: bookTitle (String), borrower (String), loanDuration (Int)
 * 2. Constructor: Primary Constructor dengan Default Argument loanDuration = 1 hari
 * 3. Method: calculateFine()
 *    - Rumus: Jika loanDuration > 3 hari, denda = (Durasi - 3) * Rp 2.000
 *    - Jika durasi <= 3 hari, denda = 0
 *    - Method mengembalikan nilai Int (Total Denda)
 */
class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1  // Default = 1 hari
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}