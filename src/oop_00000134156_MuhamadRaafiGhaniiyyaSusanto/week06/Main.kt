package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // ===== GUIDED LAB =====
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // ===== TASK: SMART HOME SYSTEM =====
    println("\n" + "=".repeat(50))
    println("SMART HOME SYSTEM TESTING")
    println("=".repeat(50))

    // ONLY instantiate devices (NO testing calls yet)
    val lampRuangTamu = SmartLamp(id = "L001", name = "Ruang Tamu")
    val speakerDapur = SmartSpeaker(id = "S001", name = "Google Nest Dapur")
    val cctvGarasi = SmartCCTV(id = "C001", name = "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lampRuangTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)
}