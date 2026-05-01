package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}