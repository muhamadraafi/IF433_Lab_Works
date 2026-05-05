package oop_00000134156_MuhamadRaafiGhaniiyyaSusanto.week09

data class Student(val name: String, val grade: Int, val major: String)

fun main() {
    val students = listOf(
        Student("Alice", 85, "Computer Science"),
        Student("Bob", 72, "Business"),
        Student("Charlie", 90, "Computer Science"),
        Student("Diana", 65, "Engineering"),
        Student("Eve", 88, "Business")
    )
    println("All Students: $students")

    println("\n=== CHAINING OPERATIONS ===")
    val topStudents = students
        .filter { it.grade >= 80 }
        .sortedByDescending { it.grade }
        .map { "${it.name} (${it.grade}) - ${it.major}" }

    println("Top Students (Grade >= 80):")
    topStudents.forEach { println("  - $it") }
}