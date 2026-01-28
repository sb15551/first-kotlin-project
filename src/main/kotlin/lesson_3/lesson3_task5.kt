package ru.behavior.lesson_3

fun main() {

    val incomingData = "D2-D4;0"

    val parts = incomingData.split("-", ";")

    val from: String = parts[0]
    val to: String = parts[1]
    val moveNumber: String = parts[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")

}