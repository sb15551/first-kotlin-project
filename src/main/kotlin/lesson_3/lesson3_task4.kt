package ru.behavior.lesson_3

fun main() {

    var from: String = "E2"
    var to: String = "E4"
    var moveNumber: Int = 1

    val firstMove = "[$from-$to;$moveNumber]"
    println("Первый ход: $firstMove")

    from = "D2"
    to = "D3"
    moveNumber = 2

    println("Следующий ход белых: [$from-$to;$moveNumber]")

}