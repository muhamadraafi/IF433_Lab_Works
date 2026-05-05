package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    printData("Hello World")

    val result1 = processData(99.9)
    val result2 = processData("Kotlin Generic")
    println("Hasil processData: $result1")
    println("Hasil processData: $result2")

    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")
}