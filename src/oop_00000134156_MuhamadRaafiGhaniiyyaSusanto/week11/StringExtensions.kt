package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week11

fun String.addGreeting(): String {
    return "Hello, $this!"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}