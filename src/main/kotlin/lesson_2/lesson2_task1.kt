package ru.behavior.lesson_2

const val FORMAT_DOUBLE_NUMBER: String = "%.2f"

fun main() {

    val scores: List<Byte> = listOf(3, 4, 3, 5)
    val averageScore = scores.average()

    println("Average score = ${FORMAT_DOUBLE_NUMBER.format(averageScore)}")

}