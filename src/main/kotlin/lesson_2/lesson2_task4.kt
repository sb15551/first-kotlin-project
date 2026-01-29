package ru.behavior.lesson_2

fun main() {

    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buff: Float = 0.2f
    val bonusCrystal: Int = (crystalOre * buff).toInt()
    val bonusIron: Int = (ironOre * buff).toInt()

    println("Crystal ore: $bonusCrystal")
    println("Iron ore: $bonusIron")

}